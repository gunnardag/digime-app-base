package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by gunnar on 26.3.2018.
 */

public class MeasurementCategory extends RealmObject {

    @Expose
    @SerializedName("codings")
    public RealmList<MeasurementCategoryCoding> codings;

    @Expose
    @SerializedName("text")
    public String text;

    public MeasurementCategory() {}

    public MeasurementCategory(RealmList<MeasurementCategoryCoding> codings, String text) {
        this.codings = codings;
        this.text = text;
    }

    public RealmList<MeasurementCategoryCoding> getCodings() {
        return codings;
    }

    public void setCodings(RealmList<MeasurementCategoryCoding> codings) {
        this.codings = codings;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
