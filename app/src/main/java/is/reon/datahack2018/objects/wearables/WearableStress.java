package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 26.3.2018.
 */

public class WearableStress extends RealmObject {

    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("id")
    public String StressId;

    @Expose
    @SerializedName("accountentityid")
    public String AccountEntityId;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("duration")
    public int Duration;

    @Expose
    @SerializedName("calendardate")
    public String CalendarDate;

    public WearableStress() {}

    public WearableStress(String stressId, String accountEntityId, String entityId, long createdDate, int duration, String calendarDate) {
        StressId = stressId;
        AccountEntityId = accountEntityId;
        EntityId = entityId;
        CreatedDate = createdDate;
        Duration = duration;
        CalendarDate = calendarDate;
    }

    public WearableStress(long id, String stressId, String accountEntityId, String entityId, long createdDate, int duration, String calendarDate) {
        this.id = id;
        StressId = stressId;
        AccountEntityId = accountEntityId;
        EntityId = entityId;
        CreatedDate = createdDate;
        Duration = duration;
        CalendarDate = calendarDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStressId() {
        return StressId;
    }

    public void setStressId(String stressId) {
        StressId = stressId;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }

    public String getAccountEntityId() {
        return AccountEntityId;
    }

    public void setAccountEntityId(String accountEntityId) {
        AccountEntityId = accountEntityId;
    }

    public long getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(long createdDate) {
        CreatedDate = createdDate;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public String getCalendarDate() {
        return CalendarDate;
    }

    public void setCalendarDate(String calendarDate) {
        CalendarDate = calendarDate;
    }
}
