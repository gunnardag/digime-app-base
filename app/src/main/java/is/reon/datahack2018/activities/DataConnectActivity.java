package is.reon.datahack2018.activities;

import android.app.Activity;
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

    private final String TAG = "DataConnectActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Authorize with the app id and contract id from the manifest file.
        DigiMeClient.getInstance().authorize(this, new SDKCallback<CASession>() {
            @Override
            public void succeeded(SDKResponse<CASession> result) {
                Log.d(TAG, "succeeded: "+result.response.message());
                fetchData();
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
                    for(String id: files.fileIds) {
                        DigiMeClient.getInstance().getFileJSON(id, new SDKCallback<JsonElement>()
                        {
                            @Override
                            public void succeeded(SDKResponse<JsonElement> sdkResponse)
                            {
                                Log.d(TAG, "succeeded: "+sdkResponse.body.getAsString());
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
}
