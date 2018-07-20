package is.reon.datahack2018;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import me.digi.sdk.core.DigiMeClient;

public class DataHackApplication extends Application
{
    private Realm realm;

    @Override
    public void onCreate()
    {
        super.onCreate();
        DigiMeClient.init(DataHackApplication.this);

    }

    private void setupRealm() {

        Realm.init(this);

        RealmConfiguration configuration;

        configuration = new RealmConfiguration.Builder()
                .name("appbase.realm")
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                .build();

        realm = Realm.getInstance(configuration);
    }

    public Realm getRealm() {
        if(realm == null) {
            setupRealm();
        }
        return realm;
    }
}
