package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by gunnar on 26.3.2018.
 */

public class ValueQuantityUnitCoding extends RealmObject {

    @Expose
    @SerializedName("display")
    public String display;

    public ValueQuantityUnitCoding() {}

    public ValueQuantityUnitCoding(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
