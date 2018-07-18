package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by gunnar on 26.3.2018.
 */

public class SummaryObject extends RealmObject {

    @Expose
    @SerializedName("count")
    public int count;

    @Expose
    @SerializedName("minutes")
    public int minutes;

    @Expose
    @SerializedName("thirtydayavgminutes")
    public int thirtyDayAvgMinutes;

    public SummaryObject() {}

    public SummaryObject(int count, int minutes, int thirtyDayAvgMinutes) {
        this.count = count;
        this.minutes = minutes;
        this.thirtyDayAvgMinutes = thirtyDayAvgMinutes;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getThirtyDayAvgMinutes() {
        return thirtyDayAvgMinutes;
    }

    public void setThirtyDayAvgMinutes(int thirtyDayAvgMinutes) {
        this.thirtyDayAvgMinutes = thirtyDayAvgMinutes;
    }
}
