package is.reon.datahack2018.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.gson.JsonElement;
import me.digi.sdk.core.DigiMeClient;
import me.digi.sdk.core.SDKCallback;
import me.digi.sdk.core.SDKException;
import me.digi.sdk.core.SDKResponse;
import me.digi.sdk.core.entities.CAFiles;
import me.digi.sdk.core.session.CASession;

public class DataConnectActivity extends Activity {

    private int filecount;
    private int filesprocessed = 0;
    private final String TAG = "DataConnectActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Authorize with the app id and contract id from the manifest file.
        DigiMeClient.getInstance().authorize(this, new SDKCallback<CASession>() {
            @Override
            public void succeeded(SDKResponse<CASession> result) {
                Log.d(TAG, "succeeded: authorize");

            }

            @Override
            public void failed(SDKException exception) {
                Log.d(TAG, "failed: authorizing");
            }
        });
    }

    private void fetchData() {
        DigiMeClient.getInstance().getFileList(new SDKCallback<CAFiles>() {
            @Override
            public void succeeded(SDKResponse<CAFiles> result) {
                Log.d(TAG, "succeeded: file list");
                CAFiles files = result.body;
                if(files!=null && files.fileIds != null){
                    filecount = files.fileIds.size();
                    for(String id: files.fileIds) {
                        DigiMeClient.getInstance().getFileJSON(id, new SDKCallback<JsonElement>()
                        {
                            @Override
                            public void succeeded(SDKResponse<JsonElement> sdkResponse)
                            {
                                filesprocessed++;
                                Log.d(TAG, "succeeded: "+sdkResponse.body.toString());
                                Log.d(TAG, "processing  "+filesprocessed+"/"+filecount);
                                if(filesprocessed==filecount)
                                    onBackPressed();

                            }

                            @Override
                            public void failed(SDKException e)
                            {
                                Log.d(TAG, "failed: getting data");
                            }
                        });
                    }
                }
            }

            @Override
            public void failed(SDKException exception)  {
                //Handle exception or error response
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        DigiMeClient.getInstance().getAuthManager().onActivityResult(requestCode, resultCode, data);
        fetchData();
    }
}
