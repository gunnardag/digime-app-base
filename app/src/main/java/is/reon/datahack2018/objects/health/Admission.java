package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 13.2.2018.
 */

public class Admission extends RealmObject {

    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("organization")
    public String Organization;

    @Expose
    @SerializedName("servicegroup")
    public String ServiceGroup;

    @Expose
    @SerializedName("responsiblephysician")
    public String ResponsiblePhysician;

    @Expose
    @SerializedName("spectreatmentid")
    public String SpectreatmentId;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("dischargedate")
    public long DischargeDate;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    public Admission() {}

    public Admission(
            String organization,
            String serviceGroup,
            String responsiblePhysician,
            String spectreatmentId,
            long createdDate,
            long dischargeDate,
            String entityId) {
        Organization = organization;
        ServiceGroup = serviceGroup;
        ResponsiblePhysician = responsiblePhysician;
        SpectreatmentId = spectreatmentId;
        CreatedDate = createdDate;
        DischargeDate = dischargeDate;
        EntityId = entityId;
    }

    public Admission(
            long id,
            String organization,
            String serviceGroup,
            String responsiblePhysician,
            String spectreatmentId,
            long createdDate,
            long dischargeDate,
            String entityId) {
        this.id = id;
        Organization = organization;
        ServiceGroup = serviceGroup;
        ResponsiblePhysician = responsiblePhysician;
        SpectreatmentId = spectreatmentId;
        CreatedDate = createdDate;
        DischargeDate = dischargeDate;
        EntityId = entityId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }

    public String getServiceGroup() {
        return ServiceGroup;
    }

    public void setServiceGroup(String serviceGroup) {
        ServiceGroup = serviceGroup;
    }

    public String getResponsiblePhysician() {
        return ResponsiblePhysician;
    }

    public void setResponsiblePhysician(String responsiblePhysician) {
        ResponsiblePhysician = responsiblePhysician;
    }

    public String getSpectreatmentId() {
        return SpectreatmentId;
    }

    public void setSpectreatmentId(String spectreatmentId) {
        SpectreatmentId = spectreatmentId;
    }

    public long getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(long createdDate) {
        CreatedDate = createdDate;
    }

    public long getDischargeDate() {
        return DischargeDate;
    }

    public void setDischargeDate(long dischargeDate) {
        DischargeDate = dischargeDate;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }
}
