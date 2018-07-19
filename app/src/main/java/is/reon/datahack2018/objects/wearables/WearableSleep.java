package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.annotations.PrimaryKey;
import is.reon.datahack2018.objects.DigiRealmObject;

/**
 * Created by gunnar on 26.3.2018.
 */

public class WearableSleep extends DigiRealmObject {

    @Expose
    @SerializedName("accountentityid")
    public String AccountEntityId;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("duration")
    public long Duration;

    @Expose
    @SerializedName("efficiency")
    public int Efficientcy;

    @Expose
    @SerializedName("enddate")
    public long EndDate;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    @Expose
    @SerializedName("infocode")
    public int InfoCode;

    @Expose
    @SerializedName("ismainsleep")
    public boolean IsMainSleep;

    @Expose
    @SerializedName("id")
    public long MeasurementId;

    @Expose
    @SerializedName("levels")
    public RealmList<SleepLevel> Levels;

    @Expose
    @SerializedName("summary")
    public SleepSummaryObject Summary;

    @Expose
    @SerializedName("minutesafterwakeup")
    public int MinutesAfterWakeup;

    @Expose
    @SerializedName("minutesasleep")
    public int MinutesAsleep;

    @Expose
    @SerializedName("minutesawake")
    public int MinutesAwake;

    @Expose
    @SerializedName("minutestofallasleep")
    public int MinutesToFallAsleep;

    @Expose
    @SerializedName("startdate")
    public long StartDate;

    @Expose
    @SerializedName("timeinbed")
    public int TimeInBed;

    @Expose
    @SerializedName("type")
    public String Type;

    public WearableSleep() {}

    public WearableSleep(String accountEntityId, long createdDate, long duration, int efficientcy, long endDate, String entityId, int infoCode, boolean isMainSleep, long measurementId, RealmList<SleepLevel> levels, SleepSummaryObject summary, int minutesAfterWakeup, int minutesAsleep, int minutesAwake, int minutesToFallAsleep, long startDate, int timeInBed, String type) {
        AccountEntityId = accountEntityId;
        CreatedDate = createdDate;
        Duration = duration;
        Efficientcy = efficientcy;
        EndDate = endDate;
        EntityId = entityId;
        InfoCode = infoCode;
        IsMainSleep = isMainSleep;
        MeasurementId = measurementId;
        Levels = levels;
        Summary = summary;
        MinutesAfterWakeup = minutesAfterWakeup;
        MinutesAsleep = minutesAsleep;
        MinutesAwake = minutesAwake;
        MinutesToFallAsleep = minutesToFallAsleep;
        StartDate = startDate;
        TimeInBed = timeInBed;
        Type = type;
    }

    public WearableSleep(int id, int digiDataSource, int digiDataSourceNumber, String accountEntityId, long createdDate, long duration, int efficientcy, long endDate, String entityId, int infoCode, boolean isMainSleep, long measurementId, RealmList<SleepLevel> levels, SleepSummaryObject summary, int minutesAfterWakeup, int minutesAsleep, int minutesAwake, int minutesToFallAsleep, long startDate, int timeInBed, String type) {
        this.id = id;
        this.digiDataSource = digiDataSource;
        this.digiDataSourceNumber = digiDataSourceNumber;
        AccountEntityId = accountEntityId;
        CreatedDate = createdDate;
        Duration = duration;
        Efficientcy = efficientcy;
        EndDate = endDate;
        EntityId = entityId;
        InfoCode = infoCode;
        IsMainSleep = isMainSleep;
        MeasurementId = measurementId;
        Levels = levels;
        Summary = summary;
        MinutesAfterWakeup = minutesAfterWakeup;
        MinutesAsleep = minutesAsleep;
        MinutesAwake = minutesAwake;
        MinutesToFallAsleep = minutesToFallAsleep;
        StartDate = startDate;
        TimeInBed = timeInBed;
        Type = type;
    }


    public String getAccountEntityId() {
        return AccountEntityId;
    }

    public void setAccountEntityId(String accountEntityId) {
        AccountEntityId = accountEntityId;
    }

    @Override
    public long getCreatedDate() {
        return CreatedDate;
    }

    @Override
    public String getName() {
        return String.valueOf(Duration);
    }

    public void setCreatedDate(long createdDate) {
        CreatedDate = createdDate;
    }

    public long getDuration() {
        return Duration;
    }

    public void setDuration(long duration) {
        Duration = duration;
    }

    public int getEfficientcy() {
        return Efficientcy;
    }

    public void setEfficientcy(int efficientcy) {
        Efficientcy = efficientcy;
    }

    public long getEndDate() {
        return EndDate;
    }

    public void setEndDate(long endDate) {
        EndDate = endDate;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }

    public int getInfoCode() {
        return InfoCode;
    }

    public void setInfoCode(int infoCode) {
        InfoCode = infoCode;
    }

    public boolean isMainSleep() {
        return IsMainSleep;
    }

    public void setMainSleep(boolean mainSleep) {
        IsMainSleep = mainSleep;
    }

    public long getMeasurementId() {
        return MeasurementId;
    }

    public void setMeasurementId(long measurementId) {
        MeasurementId = measurementId;
    }

    public RealmList<SleepLevel> getLevels() {
        return Levels;
    }

    public void setLevels(RealmList<SleepLevel> levels) {
        Levels = levels;
    }

    public SleepSummaryObject getSummary() {
        return Summary;
    }

    public void setSummary(SleepSummaryObject summary) {
        Summary = summary;
    }

    public int getMinutesAfterWakeup() {
        return MinutesAfterWakeup;
    }

    public void setMinutesAfterWakeup(int minutesAfterWakeup) {
        MinutesAfterWakeup = minutesAfterWakeup;
    }

    public int getMinutesAsleep() {
        return MinutesAsleep;
    }

    public void setMinutesAsleep(int minutesAsleep) {
        MinutesAsleep = minutesAsleep;
    }

    public int getMinutesAwake() {
        return MinutesAwake;
    }

    public void setMinutesAwake(int minutesAwake) {
        MinutesAwake = minutesAwake;
    }

    public int getMinutesToFallAsleep() {
        return MinutesToFallAsleep;
    }

    public void setMinutesToFallAsleep(int minutesToFallAsleep) {
        MinutesToFallAsleep = minutesToFallAsleep;
    }

    public long getStartDate() {
        return StartDate;
    }

    public void setStartDate(long startDate) {
        StartDate = startDate;
    }

    public int getTimeInBed() {
        return TimeInBed;
    }

    public void setTimeInBed(int timeInBed) {
        TimeInBed = timeInBed;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
