package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 15.5.2018.
 */

public class GlycoHealthIndex extends RealmObject {


    @PrimaryKey
    @Expose
    @SerializedName("id")
    private int id;

    @SerializedName("date")
    public long date;

    @SerializedName("value")
    public float value;

    public GlycoHealthIndex() {}

    public GlycoHealthIndex(float value, long date) {
        this.value = value;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
