package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 26.3.2018.
 */

public class EpochSummary extends RealmObject {

    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("id")
    public String EpochSummaryd;

    @Expose
    @SerializedName("accountentityid")
    public String AccountEntityid;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    @Expose
    @SerializedName("type")
    public String Type;

    @Expose
    @SerializedName("kilocalories")
    public int KiloCalories;

    @Expose
    @SerializedName("steps")
    public int Steps;

    @Expose
    @SerializedName("distance")
    public float Distance;

    @Expose
    @SerializedName("duration")
    public int Duration;

    @Expose
    @SerializedName("time")
    public int Time;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("met")
    public float Met;

    @Expose
    @SerializedName("intensity")
    public String Intensity;

    @Expose
    @SerializedName("meanmotionintensity")
    public float MeanMotionIntensity;

    @Expose
    @SerializedName("maxmotionintensity")
    public int MaxMotionIntensity;

    public EpochSummary() {}

    public EpochSummary(String epochSummaryd, String accountEntityid, String entityId, String type, int kiloCalories, int steps, float distance, int duration, int time, long createdDate, float met, String intensity, float meanMotionIntensity, int maxMotionIntensity) {
        EpochSummaryd = epochSummaryd;
        AccountEntityid = accountEntityid;
        EntityId = entityId;
        Type = type;
        KiloCalories = kiloCalories;
        Steps = steps;
        Distance = distance;
        Duration = duration;
        Time = time;
        CreatedDate = createdDate;
        Met = met;
        Intensity = intensity;
        MeanMotionIntensity = meanMotionIntensity;
        MaxMotionIntensity = maxMotionIntensity;
    }

    public EpochSummary(long id, String epochSummaryd, String accountEntityid, String entityId, String type, int kiloCalories, int steps, float distance, int duration, int time, long createdDate, float met, String intensity, float meanMotionIntensity, int maxMotionIntensity) {
        this.id = id;
        EpochSummaryd = epochSummaryd;
        AccountEntityid = accountEntityid;
        EntityId = entityId;
        Type = type;
        KiloCalories = kiloCalories;
        Steps = steps;
        Distance = distance;
        Duration = duration;
        Time = time;
        CreatedDate = createdDate;
        Met = met;
        Intensity = intensity;
        MeanMotionIntensity = meanMotionIntensity;
        MaxMotionIntensity = maxMotionIntensity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEpochSummaryd() {
        return EpochSummaryd;
    }

    public void setEpochSummaryd(String epochSummaryd) {
        EpochSummaryd = epochSummaryd;
    }

    public String getAccountEntityid() {
        return AccountEntityid;
    }

    public void setAccountEntityid(String accountEntityid) {
        AccountEntityid = accountEntityid;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getKiloCalories() {
        return KiloCalories;
    }

    public void setKiloCalories(int kiloCalories) {
        KiloCalories = kiloCalories;
    }

    public int getSteps() {
        return Steps;
    }

    public void setSteps(int steps) {
        Steps = steps;
    }

    public float getDistance() {
        return Distance;
    }

    public void setDistance(float distance) {
        Distance = distance;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public long getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(long createdDate) {
        CreatedDate = createdDate;
    }

    public float getMet() {
        return Met;
    }

    public void setMet(float met) {
        Met = met;
    }

    public String getIntensity() {
        return Intensity;
    }

    public void setIntensity(String intensity) {
        Intensity = intensity;
    }

    public float getMeanMotionIntensity() {
        return MeanMotionIntensity;
    }

    public void setMeanMotionIntensity(float meanMotionIntensity) {
        MeanMotionIntensity = meanMotionIntensity;
    }

    public int getMaxMotionIntensity() {
        return MaxMotionIntensity;
    }

    public void setMaxMotionIntensity(int maxMotionIntensity) {
        MaxMotionIntensity = maxMotionIntensity;
    }
}
