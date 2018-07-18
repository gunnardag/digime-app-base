package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by gunnar on 26.3.2018.
 */

public class ValueQuantity extends RealmObject {

    @Expose
    @SerializedName("max")
    public int max;

    @Expose
    @SerializedName("min")
    public int min;

    @Expose
    @SerializedName("unitcodings")
    public RealmList<ValueQuantityUnitCoding> unitcodings;

    @Expose
    @SerializedName("valuestring")
    public String valuestring;

    @Expose
    @SerializedName("value")
    public float value;

    @Expose
    @SerializedName("warning")
    public String warning;

    public ValueQuantity() {}

    public ValueQuantity(int max, int min, RealmList<ValueQuantityUnitCoding> unitcodings, String valuestring, float value, String warning) {
        this.max = max;
        this.min = min;
        this.unitcodings = unitcodings;
        this.valuestring = valuestring;
        this.value = value;
        this.warning = warning;
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

    public RealmList<ValueQuantityUnitCoding> getUnitcodings() {
        return unitcodings;
    }

    public void setUnitcodings(RealmList<ValueQuantityUnitCoding> unitcodings) {
        this.unitcodings = unitcodings;
    }

    public String getValuestring() {
        return valuestring;
    }

    public void setValuestring(String valuestring) {
        this.valuestring = valuestring;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }
}
