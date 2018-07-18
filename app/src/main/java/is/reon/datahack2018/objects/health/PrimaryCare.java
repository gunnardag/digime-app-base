package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class PrimaryCare extends RealmObject {

    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("createddatae")
    public long CreatedDate;

    @Expose
    @SerializedName("arriveid")
    public int ArriveId;

    @Expose
    @SerializedName("resourcename")
    public String ResourceName;

    @Expose
    @SerializedName("contactname")
    public String ContactName;

    @Expose
    @SerializedName("departmentorgname")
    public String DepartmentOrgName;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    public PrimaryCare(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(long createdDate) {
        CreatedDate = createdDate;
    }

    public int getArriveId() {
        return ArriveId;
    }

    public void setArriveId(int arriveId) {
        ArriveId = arriveId;
    }

    public String getResourceName() {
        return ResourceName;
    }

    public void setResourceName(String resourceName) {
        ResourceName = resourceName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getDepartmentOrgName() {
        return DepartmentOrgName;
    }

    public void setDepartmentOrgName(String departmentOrgName) {
        DepartmentOrgName = departmentOrgName;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }
}
