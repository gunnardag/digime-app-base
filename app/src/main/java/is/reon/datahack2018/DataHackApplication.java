package is.reon.datahack2018;

import android.app.Application;
import me.digi.sdk.core.DigiMeClient;

public class DataHackApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        DigiMeClient.init(DataHackApplication.this);

    }
}
