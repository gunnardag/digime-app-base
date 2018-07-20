package is.reon.datahack2018.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import io.realm.Realm;
import is.reon.datahack2018.DataHackApplication;
import is.reon.datahack2018.R;
import is.reon.datahack2018.objects.DigiObjectInterface;
import is.reon.datahack2018.objects.finance.Transaction;
import is.reon.datahack2018.objects.wearables.WearableSleep;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Realm realm;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.test_button).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, DataConnectActivity.class);
                startActivity(intent);
            }
        });

        realm = ((DataHackApplication)getApplication()).getRealm();
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Transaction s = new Transaction();
                s.setId(2);
                realm.copyToRealmOrUpdate(s);
            }
        });
    }
}
