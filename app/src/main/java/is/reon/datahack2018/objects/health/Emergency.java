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

public class Emergency extends RealmObject implements DigiObjectInterface {


    @Override
    public long getSortableDate() {
        return CreatedDate;
    }

    @Override
    public String getSortableName() {
        return OrganizationName;
    }

    @Override
    public int getListIconDrawable() {
        return R.drawable.emergency_icon;
    }

    @Override
    public String getListTitle() {
        return OrganizationName;
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
    @SerializedName("arrivalid")
    public int ArrivalId;

    @Expose
    @SerializedName("organizationname")
    public String OrganizationName;

    @Expose
    @SerializedName("responsiblephysician")
    public String ResponsiblePhysician;

    @Expose
    @SerializedName("spectreatmentid")
    public int SpecTreatmentId;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    public Emergency(){}

    public Emergency(long id, long createdDate, int arrivalId, String organizationName, String responsiblePhysician, int specTreatmentId, String entityId) {
        this.id = id;
        CreatedDate = createdDate;
        ArrivalId = arrivalId;
        OrganizationName = organizationName;
        ResponsiblePhysician = responsiblePhysician;
        SpecTreatmentId = specTreatmentId;
        EntityId = entityId;
    }

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
        return ArrivalId;
    }

    public void setArriveId(int arrivalId) {
        ArrivalId = arrivalId;
    }

    public String getOrganizationName() {
        return OrganizationName;
    }

    public void setOrganizationName(String organizationName) {
        OrganizationName = organizationName;
    }

    public String getResponsiblePhysician() {
        return ResponsiblePhysician;
    }

    public void setResponsiblePhysician(String responsiblePhysician) {
        ResponsiblePhysician = responsiblePhysician;
    }

    public int getSpecTreatmentId() {
        return SpecTreatmentId;
    }

    public void setSpecTreatmentId(int specTreatmentId) {
        SpecTreatmentId = specTreatmentId;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }
}
