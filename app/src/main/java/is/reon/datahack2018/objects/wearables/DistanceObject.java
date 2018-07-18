package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;

/**
 * Created by gunnar on 26.3.2018.
 */

public class DistanceObject extends RealmObject {

    @Expose
    @SerializedName("activity")
    public String activity;

    @Expose
    @SerializedName("distance")
    public float distance;

    public DistanceObject() {}

    public DistanceObject(String activity, float distance) {
        this.activity = activity;
        this.distance = distance;
    }



    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
}