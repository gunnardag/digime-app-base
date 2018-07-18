package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by gunnar on 23.3.2018.
 */

public class HeartRateObject extends RealmObject {

    @Expose
    @SerializedName("caloriesout")
    public float caloriesOut;

    @Expose
    @SerializedName("max")
    public int max;

    @Expose
    @SerializedName("min")
    public int min;

    @Expose
    @SerializedName("minutes")
    public int minutes;

    @Expose
    @SerializedName("name")
    public String name;

    public HeartRateObject() {}

    public HeartRateObject(float caloriesOut, int max, int min, int minutes, String name) {
        this.caloriesOut = caloriesOut;
        this.max = max;
        this.min = min;
        this.minutes = minutes;
        this.name = name;
    }

    public float getCaloriesOut() {
        return caloriesOut;
    }

    public void setCaloriesOut(float caloriesOut) {
        this.caloriesOut = caloriesOut;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
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
