package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by gunnar on 23.3.2018.
 */

public class WearableActivityDurationObject extends RealmObject {

    @Expose
    @SerializedName("active")
    public long active;

    @Expose
    @SerializedName("original")
    public long original;

    @Expose
    @SerializedName("total")
    public long total;

    public WearableActivityDurationObject() {}

    public WearableActivityDurationObject(long active, long original, long total) {
        this.active = active;
        this.original = original;
        this.total = total;
    }

    public long getActive() {
        return active;
    }

    public void setActive(long active) {
        this.active = active;
    }

    public long getOriginal() {
        return original;
    }

    public void setOriginal(long original) {
        this.original = original;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
