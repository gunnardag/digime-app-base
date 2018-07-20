package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import is.reon.datahack2018.R;
import is.reon.datahack2018.objects.DigiObjectInterface;
import is.reon.datahack2018.util.DigiDateUtil;

public class Vaccination extends RealmObject implements DigiObjectInterface {


    @Override
    public long getSortableDate() {
        return CreatedDate;
    }

    @Override
    public String getSortableName() {
        return Codes;
    }

    @Override
    public int getListIconDrawable() {
        return R.drawable.vaccinations_icon;
    }

    @Override
    public String getListTitle() {
        return Codes;
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
    @SerializedName("code")
    public String Code;

    @Expose
    @SerializedName("codename")
    public String CodeName;

    @Expose
    @SerializedName("codes")
    public String Codes;

    @Expose
    @SerializedName("codingsystem")
    public String CodingSystem;

    @Expose
    @SerializedName("senderdescription")
    public String SenderDescription;

    @Expose
    @SerializedName("sendergateway")
    public String SenderGateway;

    @Expose
    @SerializedName("senderid")
    public String SenderId;

    @Expose
    @SerializedName("sendersystem")
    public String SenderSystem;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    public Vaccination() {}

    public Vaccination(long id, long createdDate, String code, String codeName, String codes, String codingSystem, String senderDescription, String senderGateway, String senderId, String senderSystem, String entityId) {
        this.id = id;
        CreatedDate = createdDate;
        Code = code;
        CodeName = codeName;
        Codes = codes;
        CodingSystem = codingSystem;
        SenderDescription = senderDescription;
        SenderGateway = senderGateway;
        SenderId = senderId;
        SenderSystem = senderSystem;
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

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getCodingSystem() {
        return CodingSystem;
    }

    public void setCodingSystem(String codingSystem) {
        CodingSystem = codingSystem;
    }

    public String getCodeName() {
        return CodeName;
    }

    public void setCodeName(String codeName) {
        CodeName = codeName;
    }

    public String getSenderGateway() {
        return SenderGateway;
    }

    public void setSenderGateway(String senderGateway) {
        SenderGateway = senderGateway;
    }

    public String getSenderId() {
        return SenderId;
    }

    public void setSenderId(String senderId) {
        SenderId = senderId;
    }

    public String getSenderSystem() {
        return SenderSystem;
    }

    public void setSenderSystem(String senderSystem) {
        SenderSystem = senderSystem;
    }

    public String getSenderDescription() {
        return SenderDescription;
    }

    public void setSenderDescription(String senderDescription) {
        SenderDescription = senderDescription;
    }

    public String getCodes() {
        return Codes;
    }

    public void setCodes(String codes) {
        Codes = codes;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }
}
