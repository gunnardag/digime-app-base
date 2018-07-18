package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by gunnar on 26.3.2018.
 */

public class SleepLevel extends RealmObject {

    @Expose
    @SerializedName("createddate")
    public long createdDate;

    @Expose
    @SerializedName("level")
    public String level;

    @Expose
    @SerializedName("seconds")
    public int seconds;

    public SleepLevel() {}

    public SleepLevel(long createdDate, String level, int seconds) {
        this.createdDate = createdDate;
        this.level = level;
        this.seconds = seconds;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}

