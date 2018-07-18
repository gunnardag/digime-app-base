package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 23.3.2018.
 */

public class DailyActivitySummary extends RealmObject {
    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("accountentityid")
    public String AccountEntityId;

    @Expose
    @SerializedName("activescore")
    public int ActiveScore;

    @Expose
    @SerializedName("activitycalories")
    public int ActivityCalories;

    @Expose
    @SerializedName("caloriesbmr")
    public int CaloriesBMR;

    @Expose
    @SerializedName("caloriesout")
    public int CaloriesOut;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("distances")
    public RealmList<DistanceObject> Distances;

    @Expose
    @SerializedName("elevation")
    public float Elevation;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    @Expose
    @SerializedName("fairlyactiveminutes")
    public int FairlyActiveMinutes;

    @Expose
    @SerializedName("floors")
    public int Floors;

    @Expose
    @SerializedName("goals")
    public GoalObject Goals;

    @Expose
    @SerializedName("heartratezones")
    public RealmList<HeartRateObject> HeartRateZones;

    @Expose
    @SerializedName("id")
    public String MeasurementId;

    @Expose
    @SerializedName("lightlyactiveminutes")
    public int LightlyActiveMinutes;

    @Expose
    @SerializedName("marginalcalories")
    public int MarginalCalories;

    @Expose
    @SerializedName("restingheartrate")
    public int RestingHeartRate;

    @Expose
    @SerializedName("sedentaryminutes")
    public int SedentaryMinutes;

    @Expose
    @SerializedName("steps")
    public int Steps;

    @Expose
    @SerializedName("veryactiveminutes")
    public int VeryActiveMinutes;

    public DailyActivitySummary() {}

    public DailyActivitySummary(String accountEntityId, int activeScore, int activityCalories, int caloriesBMR, int caloriesOut, long createdDate, RealmList<DistanceObject> distances, float elevation, String entityId, int fairlyActiveMinutes, int floors, GoalObject goals, RealmList<HeartRateObject> heartRateZones, String measurementId, int lightlyActiveMinutes, int marginalCalories, int restingHeartRate, int sedentaryMinutes, int steps, int veryActiveMinutes) {
        AccountEntityId = accountEntityId;
        ActiveScore = activeScore;
        ActivityCalories = activityCalories;
        CaloriesBMR = caloriesBMR;
        CaloriesOut = caloriesOut;
        CreatedDate = createdDate;
        Distances = distances;
        Elevation = elevation;
        EntityId = entityId;
        FairlyActiveMinutes = fairlyActiveMinutes;
        Floors = floors;
        Goals = goals;
        HeartRateZones = heartRateZones;
        MeasurementId = measurementId;
        LightlyActiveMinutes = lightlyActiveMinutes;
        MarginalCalories = marginalCalories;
        RestingHeartRate = restingHeartRate;
        SedentaryMinutes = sedentaryMinutes;
        Steps = steps;
        VeryActiveMinutes = veryActiveMinutes;
    }

    public DailyActivitySummary(long id, String accountEntityId, int activeScore, int activityCalories, int caloriesBMR, int caloriesOut, long createdDate, RealmList<DistanceObject> distances, float elevation, String entityId, int fairlyActiveMinutes, int floors, GoalObject goals, RealmList<HeartRateObject> heartRateZones, String measurementId, int lightlyActiveMinutes, int marginalCalories, int restingHeartRate, int sedentaryMinutes, int steps, int veryActiveMinutes) {
        this.id = id;
        AccountEntityId = accountEntityId;
        ActiveScore = activeScore;
        ActivityCalories = activityCalories;
        CaloriesBMR = caloriesBMR;
        CaloriesOut = caloriesOut;
        CreatedDate = createdDate;
        Distances = distances;
        Elevation = elevation;
        EntityId = entityId;
        FairlyActiveMinutes = fairlyActiveMinutes;
        Floors = floors;
        Goals = goals;
        HeartRateZones = heartRateZones;
        MeasurementId = measurementId;
        LightlyActiveMinutes = lightlyActiveMinutes;
        MarginalCalories = marginalCalories;
        RestingHeartRate = restingHeartRate;
        SedentaryMinutes = sedentaryMinutes;
        Steps = steps;
        VeryActiveMinutes = veryActiveMinutes;
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

    public int getActiveScore() {
        return ActiveScore;
    }

    public void setActiveScore(int activeScore) {
        ActiveScore = activeScore;
    }

    public int getActivityCalories() {
        return ActivityCalories;
    }

    public void setActivityCalories(int activityCalories) {
        ActivityCalories = activityCalories;
    }

    public int getCaloriesBMR() {
        return CaloriesBMR;
    }

    public void setCaloriesBMR(int caloriesBMR) {
        CaloriesBMR = caloriesBMR;
    }

    public int getCaloriesOut() {
        return CaloriesOut;
    }

    public void setCaloriesOut(int caloriesOut) {
        CaloriesOut = caloriesOut;
    }

    public long getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(long createdDate) {
        CreatedDate = createdDate;
    }

    public RealmList<DistanceObject> getDistances() {
        return Distances;
    }

    public void setDistances(RealmList<DistanceObject> distances) {
        Distances = distances;
    }

    public float getElevation() {
        return Elevation;
    }

    public void setElevation(float elevation) {
        Elevation = elevation;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }

    public int getFairlyActiveMinutes() {
        return FairlyActiveMinutes;
    }

    public void setFairlyActiveMinutes(int fairlyActiveMinutes) {
        FairlyActiveMinutes = fairlyActiveMinutes;
    }

    public int getFloors() {
        return Floors;
    }

    public void setFloors(int floors) {
        Floors = floors;
    }

    public GoalObject getGoals() {
        return Goals;
    }

    public void setGoals(GoalObject goals) {
        Goals = goals;
    }

    public RealmList<HeartRateObject> getHeartRateZones() {
        return HeartRateZones;
    }

    public void setHeartRateZones(RealmList<HeartRateObject> heartRateZones) {
        HeartRateZones = heartRateZones;
    }

    public String getMeasurementId() {
        return MeasurementId;
    }

    public void setMeasurementId(String measurementId) {
        MeasurementId = measurementId;
    }

    public int getLightlyActiveMinutes() {
        return LightlyActiveMinutes;
    }

    public void setLightlyActiveMinutes(int lightlyActiveMinutes) {
        LightlyActiveMinutes = lightlyActiveMinutes;
    }

    public int getMarginalCalories() {
        return MarginalCalories;
    }

    public void setMarginalCalories(int marginalCalories) {
        MarginalCalories = marginalCalories;
    }

    public int getRestingHeartRate() {
        return RestingHeartRate;
    }

    public void setRestingHeartRate(int restingHeartRate) {
        RestingHeartRate = restingHeartRate;
    }

    public int getSedentaryMinutes() {
        return SedentaryMinutes;
    }

    public void setSedentaryMinutes(int sedentaryMinutes) {
        SedentaryMinutes = sedentaryMinutes;
    }

    public int getSteps() {
        return Steps;
    }

    public void setSteps(int steps) {
        Steps = steps;
    }

    public int getVeryActiveMinutes() {
        return VeryActiveMinutes;
    }

    public void setVeryActiveMinutes(int veryActiveMinutes) {
        VeryActiveMinutes = veryActiveMinutes;
    }
}
