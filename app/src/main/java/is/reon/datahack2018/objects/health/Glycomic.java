package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 23.3.2018.
 */

public class Glycomic extends RealmObject implements Serializable {

    @PrimaryKey
    @Expose
    @SerializedName("id")
    private int id;

    @Expose
    @SerializedName("timestamp")
    private long timestamp;

    @Expose
    @SerializedName("datetime")
    private String datetime;

    @Expose
    @SerializedName("uuid")
    private String uuid;

    @Expose
    @SerializedName("glycanage")
    private float glycanage;

    @Expose
    @SerializedName("galactosylation")
    private float galactosylation;

    public Glycomic() {}

    public Glycomic(int id, long timestamp, String datetime, String uuid, float glycanage, float galactosylation) {
        this.id = id;
        this.timestamp = timestamp;
        this.datetime = datetime;
        this.uuid = uuid;
        this.glycanage = glycanage;
        this.galactosylation = galactosylation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public float getGlycanage() {
        return glycanage;
    }

    public void setGlycanage(float glycanage) {
        this.glycanage = glycanage;
    }

    public float getGalactosylation() {
        return galactosylation;
    }

    public void setGalactosylation(float galactosylation) {
        this.galactosylation = galactosylation;
    }
}
