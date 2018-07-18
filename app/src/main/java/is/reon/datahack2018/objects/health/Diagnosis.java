package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 6.3.2018.
 */

public class Diagnosis extends RealmObject {

    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("code")
    public String Code;

    @Expose
    @SerializedName("codingsystem")
    public String CodingSystem;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("islongterm")
    public boolean isLongTerm;

    @Expose
    @SerializedName("lastregistration")
    public long LastRegistration;

    @Expose
    @SerializedName("name")
    public String Name;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    public Diagnosis(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(long createdDate) {
        CreatedDate = createdDate;
    }

    public boolean isLongTerm() {
        return isLongTerm;
    }

    public void setLongTerm(boolean longTerm) {
        isLongTerm = longTerm;
    }

    public long getLastRegistration() {
        return LastRegistration;
    }

    public void setLastRegistration(long lastRegistration) {
        LastRegistration = lastRegistration;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }
}
