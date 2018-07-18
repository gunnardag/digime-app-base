package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 26.3.2018.
 */

public class WearableMeasurement extends RealmObject {

    @PrimaryKey
    public int id;

    @Expose
    @SerializedName("id")
    public String WearableMeasurementId;

    @Expose
    @SerializedName("accountentityid")
    public String accountentityid;

    @Expose
    @SerializedName("categories")
    public RealmList<MeasurementCategory> categories;

    @Expose
    @SerializedName("comment")
    public String comment;

    @Expose
    @SerializedName("createddate")
    public long createddate;

    @Expose
    @SerializedName("entityid")
    public String entityid;

    @Expose
    @SerializedName("groupid")
    public String groupid;

    @Expose
    @SerializedName("isselfreported")
    public boolean isselfreported;

    @Expose
    @SerializedName("recordeddate")
    public long recordeddate;

    @Expose
    @SerializedName("status")
    public String status;

    @Expose
    @SerializedName("subcategories")
    public RealmList<MeasurementCategory> subcategories;

    @Expose
    @SerializedName("updateddate")
    public long updateddate;

    @Expose
    @SerializedName("valuequantities")
    public RealmList<ValueQuantity> valuequantities;

    public WearableMeasurement() {}

    public WearableMeasurement(String wearableMeasurementId, String accountentityid, RealmList<MeasurementCategory> categories, String comment, long createddate, String entityid, String groupid, boolean isselfreported, long recordeddate, String status, RealmList<MeasurementCategory> subcategories, long updateddate, RealmList<ValueQuantity> valuequantities) {
        WearableMeasurementId = wearableMeasurementId;
        this.accountentityid = accountentityid;
        this.categories = categories;
        this.comment = comment;
        this.createddate = createddate;
        this.entityid = entityid;
        this.groupid = groupid;
        this.isselfreported = isselfreported;
        this.recordeddate = recordeddate;
        this.status = status;
        this.subcategories = subcategories;
        this.updateddate = updateddate;
        this.valuequantities = valuequantities;
    }

    public WearableMeasurement(int id, String wearableMeasurementId, String accountentityid, RealmList<MeasurementCategory> categories, String comment, long createddate, String entityid, String groupid, boolean isselfreported, long recordeddate, String status, RealmList<MeasurementCategory> subcategories, long updateddate, RealmList<ValueQuantity> valuequantities) {
        this.id = id;
        WearableMeasurementId = wearableMeasurementId;
        this.accountentityid = accountentityid;
        this.categories = categories;
        this.comment = comment;
        this.createddate = createddate;
        this.entityid = entityid;
        this.groupid = groupid;
        this.isselfreported = isselfreported;
        this.recordeddate = recordeddate;
        this.status = status;
        this.subcategories = subcategories;
        this.updateddate = updateddate;
        this.valuequantities = valuequantities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWearableMeasurementId() {
        return WearableMeasurementId;
    }

    public void setWearableMeasurementId(String wearableMeasurementId) {
        WearableMeasurementId = wearableMeasurementId;
    }

    public String getAccountentityid() {
        return accountentityid;
    }

    public void setAccountentityid(String accountentityid) {
        this.accountentityid = accountentityid;
    }

    public RealmList<MeasurementCategory> getCategories() {
        return categories;
    }

    public void setCategories(RealmList<MeasurementCategory> categories) {
        this.categories = categories;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getCreateddate() {
        return createddate;
    }

    public void setCreateddate(long createddate) {
        this.createddate = createddate;
    }

    public String getEntityid() {
        return entityid;
    }

    public void setEntityid(String entityid) {
        this.entityid = entityid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public boolean isIsselfreported() {
        return isselfreported;
    }

    public void setIsselfreported(boolean isselfreported) {
        this.isselfreported = isselfreported;
    }

    public long getRecordeddate() {
        return recordeddate;
    }

    public void setRecordeddate(long recordeddate) {
        this.recordeddate = recordeddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RealmList<MeasurementCategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(RealmList<MeasurementCategory> subcategories) {
        this.subcategories = subcategories;
    }

    public long getUpdateddate() {
        return updateddate;
    }

    public void setUpdateddate(long updateddate) {
        this.updateddate = updateddate;
    }

    public RealmList<ValueQuantity> getValuequantities() {
        return valuequantities;
    }

    public void setValuequantities(RealmList<ValueQuantity> valuequantities) {
        this.valuequantities = valuequantities;
    }
}
