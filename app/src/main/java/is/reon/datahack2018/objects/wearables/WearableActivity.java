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

public class WearableActivity extends RealmObject {

    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("accountentityid")
    public String AccountEntityId;

    @Expose
    @SerializedName("activitylevel")
    public RealmList<WearableActivityActivityLevel> ActivityLevel;

    @Expose
    @SerializedName("activityname")
    public String ActivityName;

    @Expose
    @SerializedName("activitytypeid")
    public String ActivityTypeId;

    @Expose
    @SerializedName("averageheartrate")
    public int AverageHeartRate;

    @Expose
    @SerializedName("calories")
    public int Calories;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("distance")
    public int Distance;

    @Expose
    @SerializedName("durations")
    public WearableActivityDurationObject Durations;

    @Expose
    @SerializedName("elevationgain")
    public float ElevationGain;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    @Expose
    @SerializedName("heartratezones")
    public RealmList<HeartRateObject> HeartRateZones;

    @Expose
    @SerializedName("id")
    public long MeasurementId;

    @Expose
    @SerializedName("logtype")
    public String LogType;

    @Expose
    @SerializedName("manualvaluesspecified")
    public WearableActivityManualValuesSpecified ManualValuesSpecified;

    @Expose
    @SerializedName("originalstartdate")
    public long OriginalStartDate;

    @Expose
    @SerializedName("speed")
    public float Speed;

    @Expose
    @SerializedName("steps")
    public int Steps;

    @Expose
    @SerializedName("updateddate")
    public long UpdatedDate;

    public WearableActivity() {}

    public WearableActivity(String accountEntityId, RealmList<WearableActivityActivityLevel> activityLevel, String activityName, String activityTypeId, int averageHeartRate, int calories, long createdDate, int distance, WearableActivityDurationObject durations, float elevationGain, String entityId, RealmList<HeartRateObject> heartRateZones, long measurementId, String logType, WearableActivityManualValuesSpecified manualValuesSpecified, long originalStartDate, float speed, int steps, long updatedDate) {
        AccountEntityId = accountEntityId;
        ActivityLevel = activityLevel;
        ActivityName = activityName;
        ActivityTypeId = activityTypeId;
        AverageHeartRate = averageHeartRate;
        Calories = calories;
        CreatedDate = createdDate;
        Distance = distance;
        Durations = durations;
        ElevationGain = elevationGain;
        EntityId = entityId;
        HeartRateZones = heartRateZones;
        MeasurementId = measurementId;
        LogType = logType;
        ManualValuesSpecified = manualValuesSpecified;
        OriginalStartDate = originalStartDate;
        Speed = speed;
        Steps = steps;
        UpdatedDate = updatedDate;
    }

    public WearableActivity(long id, String accountEntityId, RealmList<WearableActivityActivityLevel> activityLevel, String activityName, String activityTypeId, int averageHeartRate, int calories, long createdDate, int distance, WearableActivityDurationObject durations, float elevationGain, String entityId, RealmList<HeartRateObject> heartRateZones, long measurementId, String logType, WearableActivityManualValuesSpecified manualValuesSpecified, long originalStartDate, float speed, int steps, long updatedDate) {
        this.id = id;
        AccountEntityId = accountEntityId;
        ActivityLevel = activityLevel;
        ActivityName = activityName;
        ActivityTypeId = activityTypeId;
        AverageHeartRate = averageHeartRate;
        Calories = calories;
        CreatedDate = createdDate;
        Distance = distance;
        Durations = durations;
        ElevationGain = elevationGain;
        EntityId = entityId;
        HeartRateZones = heartRateZones;
        MeasurementId = measurementId;
        LogType = logType;
        ManualValuesSpecified = manualValuesSpecified;
        OriginalStartDate = originalStartDate;
        Speed = speed;
        Steps = steps;
        UpdatedDate = updatedDate;
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

    public RealmList<WearableActivityActivityLevel> getActivityLevel() {
        return ActivityLevel;
    }

    public void setActivityLevel(RealmList<WearableActivityActivityLevel> activityLevel) {
        ActivityLevel = activityLevel;
    }

    public String getActivityName() {
        return ActivityName;
    }

    public void setActivityName(String activityName) {
        ActivityName = activityName;
    }

    public String getActivityTypeId() {
        return ActivityTypeId;
    }

    public void setActivityTypeId(String activityTypeId) {
        ActivityTypeId = activityTypeId;
    }

    public int getAverageHeartRate() {
        return AverageHeartRate;
    }

    public void setAverageHeartRate(int averageHeartRate) {
        AverageHeartRate = averageHeartRate;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int calories) {
        Calories = calories;
    }

    public long getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(long createdDate) {
        CreatedDate = createdDate;
    }

    public int getDistance() {
        return Distance;
    }

    public void setDistance(int distance) {
        Distance = distance;
    }

    public WearableActivityDurationObject getDurations() {
        return Durations;
    }

    public void setDurations(WearableActivityDurationObject durations) {
        Durations = durations;
    }

    public float getElevationGain() {
        return ElevationGain;
    }

    public void setElevationGain(float elevationGain) {
        ElevationGain = elevationGain;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }

    public RealmList<HeartRateObject> getHeartRateZones() {
        return HeartRateZones;
    }

    public void setHeartRateZones(RealmList<HeartRateObject> heartRateZones) {
        HeartRateZones = heartRateZones;
    }

    public long getMeasurementId() {
        return MeasurementId;
    }

    public void setMeasurementId(long measurementId) {
        MeasurementId = measurementId;
    }

    public String getLogType() {
        return LogType;
    }

    public void setLogType(String logType) {
        LogType = logType;
    }

    public WearableActivityManualValuesSpecified getManualValuesSpecified() {
        return ManualValuesSpecified;
    }

    public void setManualValuesSpecified(WearableActivityManualValuesSpecified manualValuesSpecified) {
        ManualValuesSpecified = manualValuesSpecified;
    }

    public long getOriginalStartDate() {
        return OriginalStartDate;
    }

    public void setOriginalStartDate(long originalStartDate) {
        OriginalStartDate = originalStartDate;
    }

    public float getSpeed() {
        return Speed;
    }

    public void setSpeed(float speed) {
        Speed = speed;
    }

    public int getSteps() {
        return Steps;
    }

    public void setSteps(int steps) {
        Steps = steps;
    }

    public long getUpdatedDate() {
        return UpdatedDate;
    }

    public void setUpdatedDate(long updatedDate) {
        UpdatedDate = updatedDate;
    }
}
