package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by gunnar on 19.7.2018.
 */

public class PractitionerObject extends RealmObject {

    @SerializedName("recorder")
    public String Recorder;

    public PractitionerObject() {}

    public PractitionerObject(String recorder) {
        Recorder = recorder;
    }

    public String getRecorder() {
        return Recorder;
    }

    public void setRecorder(String recorder) {
        Recorder = recorder;
    }
}
