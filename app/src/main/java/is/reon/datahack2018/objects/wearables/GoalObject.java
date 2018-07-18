package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by gunnar on 26.3.2018.
 */

public class GoalObject extends RealmObject {

    @Expose
    @SerializedName("activeminutes")
    public int activeminutes;

    @Expose
    @SerializedName("caloriesout")
    public int caloriesout;

    @Expose
    @SerializedName("distance")
    public float distance;

    @Expose
    @SerializedName("floors")
    public int floors;

    @Expose
    @SerializedName("steps")
    public int steps;

    public GoalObject() {}

    public GoalObject(int activeminutes, int caloriesout, float distance, int floors, int steps) {
        this.activeminutes = activeminutes;
        this.caloriesout = caloriesout;
        this.distance = distance;
        this.floors = floors;
        this.steps = steps;
    }

    public int getActiveminutes() {
        return activeminutes;
    }

    public void setActiveminutes(int activeminutes) {
        this.activeminutes = activeminutes;
    }

    public int getCaloriesout() {
        return caloriesout;
    }

    public void setCaloriesout(int caloriesout) {
        this.caloriesout = caloriesout;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
