package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by gunnar on 26.3.2018.
 */

public class MeasurementCategoryCoding extends RealmObject {

    @Expose
    @SerializedName("code")
    public String code;

    @Expose
    @SerializedName("display")
    public String display;

    public MeasurementCategoryCoding() {}

    public MeasurementCategoryCoding(String code, String display) {
        this.code = code;
        this.display = display;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
