package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by gunnar on 23.3.2018.
 */

public class AchievementResourceAspectRatio extends RealmObject {

    @Expose
    @SerializedName("accuracy")
    public int accuracy;

    @Expose
    @SerializedName("actual")
    public String actual;

    @Expose
    @SerializedName("closest")
    public String closest;

    public AchievementResourceAspectRatio() {}

    public AchievementResourceAspectRatio(int accuracy, String actual, String closest) {
        this.accuracy = accuracy;
        this.actual = actual;
        this.closest = closest;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public String getClosest() {
        return closest;
    }

    public void setClosest(String closest) {
        this.closest = closest;
    }
}
