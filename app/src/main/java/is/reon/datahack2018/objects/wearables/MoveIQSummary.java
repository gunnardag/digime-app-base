package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 26.3.2018.
 */

public class MoveIQSummary extends RealmObject {

    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("accountentityid")
    public String AccountEntityid;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    @Expose
    @SerializedName("id")
    public String MoveIqId;

    @Expose
    @SerializedName("calendardate")
    public String CalendarDate;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("duration")
    public int Duration;

    @Expose
    @SerializedName("type")
    public String Type;

    @Expose
    @SerializedName("subtype")
    public String SubType;

    public MoveIQSummary() {}

    public MoveIQSummary(String accountEntityid, String entityId, String moveIqId, String calendarDate, long createdDate, int duration, String type, String subType) {
        AccountEntityid = accountEntityid;
        EntityId = entityId;
        MoveIqId = moveIqId;
        CalendarDate = calendarDate;
        CreatedDate = createdDate;
        Duration = duration;
        Type = type;
        SubType = subType;
    }

    public MoveIQSummary(long id, String accountEntityid, String entityId, String moveIqId, String calendarDate, long createdDate, int duration, String type, String subType) {
        this.id = id;
        AccountEntityid = accountEntityid;
        EntityId = entityId;
        MoveIqId = moveIqId;
        CalendarDate = calendarDate;
        CreatedDate = createdDate;
        Duration = duration;
        Type = type;
        SubType = subType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getMoveIqId() {
        return MoveIqId;
    }

    public void setMoveIqId(String moveIqId) {
        MoveIqId = moveIqId;
    }

    public String getCalendarDate() {
        return CalendarDate;
    }

    public void setCalendarDate(String calendarDate) {
        CalendarDate = calendarDate;
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

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSubType() {
        return SubType;
    }

    public void setSubType(String subType) {
        SubType = subType;
    }
}
