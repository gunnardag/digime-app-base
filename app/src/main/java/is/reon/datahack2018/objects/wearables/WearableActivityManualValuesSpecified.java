package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by gunnar on 23.3.2018.
 */

public class WearableActivityManualValuesSpecified extends RealmObject {

    @Expose
    @SerializedName("calories")
    public boolean calories;

    @Expose
    @SerializedName("distance")
    public boolean distance;

    @Expose
    @SerializedName("steps")
    public boolean steps;

    public WearableActivityManualValuesSpecified() {}

    public WearableActivityManualValuesSpecified(boolean calories, boolean distance, boolean steps) {
        this.calories = calories;
        this.distance = distance;
        this.steps = steps;
    }

    public boolean isCalories() {
        return calories;
    }

    public void setCalories(boolean calories) {
        this.calories = calories;
    }

    public boolean isDistance() {
        return distance;
    }

    public void setDistance(boolean distance) {
        this.distance = distance;
    }

    public boolean isSteps() {
        return steps;
    }

    public void setSteps(boolean steps) {
        this.steps = steps;
    }
}
