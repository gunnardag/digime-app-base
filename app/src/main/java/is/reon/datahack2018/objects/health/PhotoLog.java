package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 28.3.2018.
 */

public class PhotoLog extends RealmObject implements Serializable {

    @PrimaryKey
    @SerializedName("id")
    private long id;

    @Expose
    @SerializedName("photopath")
    private String photopath;

    @Expose
    @SerializedName("title")
    private String title;

    @Expose
    @SerializedName("mealtype")
    private String mealtype;

    @Expose
    @SerializedName("message")
    private String message;

    @Expose
    @SerializedName("createddate")
    private long createdDate;

    @Expose
    @SerializedName("latitude")
    private float latitude;

    @Expose
    @SerializedName("longitude")
    private float longitude;

    public PhotoLog() {}

    public PhotoLog(long id, String photopath, String title, String mealtype, String message, long createdDate, float latitude, float longitude) {
        this.id = id;
        this.photopath = photopath;
        this.title = title;
        this.mealtype = mealtype;
        this.message = message;
        this.createdDate = createdDate;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMealtype() {
        return mealtype;
    }

    public void setMealtype(String mealtype) {
        this.mealtype = mealtype;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
