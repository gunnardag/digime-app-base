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

public class Prescription extends RealmObject implements DigiObjectInterface {


    @Override
    public long getSortableDate() {
        return CreatedDate;
    }

    @Override
    public String getSortableName() {
        return PrescribedItems;
    }

    @Override
    public int getListIconDrawable() {
        return R.drawable.prescriptions_icon;
    }

    @Override
    public String getListTitle() {
        return PrescribedItems;
    }

    @Override
    public String getListSubtitle() {
        return DigiDateUtil.getReadableDateStringFromLong(CreatedDate);
    }

    @PrimaryKey
    public long realm_id;

    @Expose
    @SerializedName("daysbetweendispensations")
    public int DaysBetweenDispensations;

    @Expose
    @SerializedName("earliestdispensationdate")
    public long EarliestDispensationdate;

    @Expose
    @SerializedName("id")
    public long id;

    @Expose
    @SerializedName("idbygateway")
    public String IdByGateway;

    @Expose
    @SerializedName("iscanceled")
    public boolean IsCanceled;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("latestdispensationdate")
    public long LatestDispensationDate;

    @Expose
    @SerializedName("prescribeddispensations")
    public int PrescribedDispensations;

    @Expose
    @SerializedName("prescribeditems")
    public String PrescribedItems;

    @Expose
    @SerializedName("prescribercontactinfo")
    public String PrescriberContactInfo;

    @Expose
    @SerializedName("prescriberid")
    public String PrescriberId;

    @Expose
    @SerializedName("prescribername")
    public String PrescriberName;

    @Expose
    @SerializedName("prescriptiontype")
    public int PrescriptionType;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    public Prescription(){}

    public long getRealm_id() {
        return realm_id;
    }

    public void setRealm_id(long realm_id) {
        this.realm_id = realm_id;
    }

    public int getDaysBetweenDispensations() {
        return DaysBetweenDispensations;
    }

    public void setDaysBetweenDispensations(int daysBetweenDispensations) {
        DaysBetweenDispensations = daysBetweenDispensations;
    }

    public long getEarliestDispensationdate() {
        return EarliestDispensationdate;
    }

    public void setEarliestDispensationdate(long earliestDispensationdate) {
        EarliestDispensationdate = earliestDispensationdate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdByGateway() {
        return IdByGateway;
    }

    public void setIdByGateway(String idByGateway) {
        IdByGateway = idByGateway;
    }

    public boolean isCanceled() {
        return IsCanceled;
    }

    public void setCanceled(boolean canceled) {
        IsCanceled = canceled;
    }

    public long getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(long createdDate) {
        CreatedDate = createdDate;
    }

    public long getLatestDispensationDate() {
        return LatestDispensationDate;
    }

    public void setLatestDispensationDate(long latestDispensationDate) {
        LatestDispensationDate = latestDispensationDate;
    }

    public int getPrescribedDispensations() {
        return PrescribedDispensations;
    }

    public void setPrescribedDispensations(int prescribedDispensations) {
        PrescribedDispensations = prescribedDispensations;
    }

    public String getPrescribedItems() {
        return PrescribedItems;
    }

    public void setPrescribedItems(String prescribedItems) {
        PrescribedItems = prescribedItems;
    }

    public String getPrescriberContactInfo() {
        return PrescriberContactInfo;
    }

    public void setPrescriberContactInfo(String prescriberContactInfo) {
        PrescriberContactInfo = prescriberContactInfo;
    }

    public String getPrescriberId() {
        return PrescriberId;
    }

    public void setPrescriberId(String prescriberId) {
        PrescriberId = prescriberId;
    }

    public String getPrescriberName() {
        return PrescriberName;
    }

    public void setPrescriberName(String prescriberName) {
        PrescriberName = prescriberName;
    }

    public int getPrescriptionType() {
        return PrescriptionType;
    }

    public void setPrescriptionType(int prescriptionType) {
        PrescriptionType = prescriptionType;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }
}
