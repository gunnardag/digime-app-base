package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 6.3.2018.
 */

public class Allergy extends RealmObject {

    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("id")
    public String AllergyId;

    @Expose
    @SerializedName("type")
    public String Type;

    @Expose
    @SerializedName("classification")
    public String Classification;

    @Expose
    @SerializedName("component")
    public String Component;

    @Expose
    @SerializedName("comment")
    public String Comment;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("atc")
    public String Atc;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    public Allergy() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAllergyId() {
        return AllergyId;
    }

    public void setAllergyId(String allergyId) {
        AllergyId = allergyId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getClassification() {
        return Classification;
    }

    public void setClassification(String classification) {
        Classification = classification;
    }

    public String getComponent() {
        return Component;
    }

    public void setComponent(String component) {
        Component = component;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public long getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(long createdDate) {
        CreatedDate = createdDate;
    }

    public String getAtc() {
        return Atc;
    }

    public void setAtc(String atc) {
        Atc = atc;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }
}