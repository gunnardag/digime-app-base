package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by gunnar on 26.3.2018.
 */

public class SleepSummaryObject extends RealmObject {

    @Expose
    @SerializedName("deep")
    public SummaryObject deep;

    @Expose
    @SerializedName("light")
    public SummaryObject light;

    @Expose
    @SerializedName("rem")
    public SummaryObject rem;

    @Expose
    @SerializedName("wake")
    public SummaryObject wake;

    public SleepSummaryObject() {}

    public SleepSummaryObject(SummaryObject deep, SummaryObject light, SummaryObject rem, SummaryObject wake) {
        this.deep = deep;
        this.light = light;
        this.rem = rem;
        this.wake = wake;
    }

    public SummaryObject getDeep() {
        return deep;
    }

    public void setDeep(SummaryObject deep) {
        this.deep = deep;
    }

    public SummaryObject getLight() {
        return light;
    }

    public void setLight(SummaryObject light) {
        this.light = light;
    }

    public SummaryObject getRem() {
        return rem;
    }

    public void setRem(SummaryObject rem) {
        this.rem = rem;
    }

    public SummaryObject getWake() {
        return wake;
    }

    public void setWake(SummaryObject wake) {
        this.wake = wake;
    }
}