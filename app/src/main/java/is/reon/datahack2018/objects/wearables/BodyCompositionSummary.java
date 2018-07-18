package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 23.3.2018.
 */

public class BodyCompositionSummary extends RealmObject {

    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("accountentityid")
    public String AccountEntityId;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    @Expose
    @SerializedName("weight")
    public int Weight;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("bodywater")
    public float BodyWater;

    @Expose
    @SerializedName("bodyfat")
    public float BodyFat;

    @Expose
    @SerializedName("bodymassindex")
    public float BodyMassIndex;

    @Expose
    @SerializedName("bonemass")
    public int BoneMass;

    @Expose
    @SerializedName("musclemass")
    public int MuscleMass;

    public BodyCompositionSummary() {}


    public BodyCompositionSummary(String accountEntityId, String entityId, int weight, long createdDate, float bodyWater, float bodyFat, float bodyMassIndex, int boneMass, int muscleMass) {
        AccountEntityId = accountEntityId;
        EntityId = entityId;
        Weight = weight;
        CreatedDate = createdDate;
        BodyWater = bodyWater;
        BodyFat = bodyFat;
        BodyMassIndex = bodyMassIndex;
        BoneMass = boneMass;
        MuscleMass = muscleMass;
    }

    public BodyCompositionSummary(long id, String accountEntityId, String entityId, int weight, long createdDate, float bodyWater, float bodyFat, float bodyMassIndex, int boneMass, int muscleMass) {
        this.id = id;
        AccountEntityId = accountEntityId;
        EntityId = entityId;
        Weight = weight;
        CreatedDate = createdDate;
        BodyWater = bodyWater;
        BodyFat = bodyFat;
        BodyMassIndex = bodyMassIndex;
        BoneMass = boneMass;
        MuscleMass = muscleMass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountEntityId() {
        return AccountEntityId;
    }

    public void setAccountEntityId(String accountEntityId) {
        AccountEntityId = accountEntityId;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public long getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(long createdDate) {
        CreatedDate = createdDate;
    }

    public float getBodyWater() {
        return BodyWater;
    }

    public void setBodyWater(float bodyWater) {
        BodyWater = bodyWater;
    }

    public float getBodyFat() {
        return BodyFat;
    }

    public void setBodyFat(float bodyFat) {
        BodyFat = bodyFat;
    }

    public float getBodyMassIndex() {
        return BodyMassIndex;
    }

    public void setBodyMassIndex(float bodyMassIndex) {
        BodyMassIndex = bodyMassIndex;
    }

    public int getBoneMass() {
        return BoneMass;
    }

    public void setBoneMass(int boneMass) {
        BoneMass = boneMass;
    }

    public int getMuscleMass() {
        return MuscleMass;
    }

    public void setMuscleMass(int muscleMass) {
        MuscleMass = muscleMass;
    }
}
