package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by gunnar on 23.3.2018.
 */

public class WearableActivityActivityLevel extends RealmObject {

    @Expose
    @SerializedName("minutes")
    public int minutes;

    @Expose
    @SerializedName("name")
    public String name;

    public WearableActivityActivityLevel() {}

    public WearableActivityActivityLevel(int minutes, String name) {
        this.minutes = minutes;
        this.name = name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
