package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gauti on 23.5.2018.
 */

public class BodyMass extends RealmObject {

    @PrimaryKey
    @SerializedName("date")
    public long date;

    @SerializedName("value")
    public float value;

    public BodyMass() {}

    public BodyMass(long date, float value) {
        this.date = date;
        this.value = value;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
