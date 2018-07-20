package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import is.reon.datahack2018.R;
import is.reon.datahack2018.objects.DigiObjectInterface;
import is.reon.datahack2018.util.DigiDateUtil;

/**
 * Created by gunnar on 6.3.2018.
 */

public class Ambulance extends RealmObject implements DigiObjectInterface {


    @Override
    public long getSortableDate() {
        return CreatedDate;
    }

    @Override
    public String getSortableName() {
        return ResponsiblePhysician;
    }

    @Override
    public int getListIconDrawable() {
        return R.drawable.ambulatory_icon;
    }

    @Override
    public String getListTitle() {
        return ResponsiblePhysician;
    }

    @Override
    public String getListSubtitle() {
        return DigiDateUtil.getReadableDateStringFromLong(CreatedDate);
    }

    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("admissionstartdate")
    public long AdmissionStartDate;

    @Expose
    @SerializedName("arrivalid")
    public int ArrivalId;

    @Expose
    @SerializedName("servicegroup")
    public String ServiceGroup;

    @Expose
    @SerializedName("responsiblephysician")
    public String ResponsiblePhysician;

    @Expose
    @SerializedName("responsiblephysicianid")
    public String ResponsiblePhysicianId;

    @Expose
    @SerializedName("responsiblephysicianmdno")
    public String ResponsiblePhysicianMdNo;

    @Expose
    @SerializedName("servicegrouparrivaldischarge")
    public String ServiceGroupArrivalDischarge;

    @Expose
    @SerializedName("treatmentid")
    public int TreatmentId;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    public Ambulance() {}

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

    public long getAdmissionStartDate() {
        return AdmissionStartDate;
    }

    public void setAdmissionStartDate(long admissionStartDate) {
        AdmissionStartDate = admissionStartDate;
    }

    public int getArrivalId() {
        return ArrivalId;
    }

    public void setArrivalId(int arrivalId) {
        ArrivalId = arrivalId;
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

    public String getResponsiblePhysicianId() {
        return ResponsiblePhysicianId;
    }

    public void setResponsiblePhysicianId(String responsiblePhysicianId) {
        ResponsiblePhysicianId = responsiblePhysicianId;
    }

    public String getResponsiblePhysicianMdNo() {
        return ResponsiblePhysicianMdNo;
    }

    public void setResponsiblePhysicianMdNo(String responsiblePhysicianMdNo) {
        ResponsiblePhysicianMdNo = responsiblePhysicianMdNo;
    }

    public String getServiceGroupArrivalDischarge() {
        return ServiceGroupArrivalDischarge;
    }

    public void setServiceGroupArrivalDischarge(String serviceGroupArrivalDischarge) {
        ServiceGroupArrivalDischarge = serviceGroupArrivalDischarge;
    }

    public int getTreatmentId() {
        return TreatmentId;
    }

    public void setTreatmentId(int treatmentId) {
        TreatmentId = treatmentId;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }
}
