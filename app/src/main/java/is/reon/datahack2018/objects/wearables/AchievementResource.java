package is.reon.datahack2018.objects.wearables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by gunnar on 23.3.2018.
 */

public class AchievementResource extends RealmObject {


    @Expose
    @SerializedName("aspectratio")
    public AchievementResourceAspectRatio aspectratio;

    @Expose
    @SerializedName("height")
    public int height;

    @Expose
    @SerializedName("mimetype")
    public String mimetype;

    @Expose
    @SerializedName("type")
    public int type;

    @Expose
    @SerializedName("url")
    public String url;

    @Expose
    @SerializedName("width")
    public int width;

    public AchievementResource() {}

    public AchievementResource(AchievementResourceAspectRatio aspectratio, int height, String mimetype, int type, String url, int width) {
        this.aspectratio = aspectratio;
        this.height = height;
        this.mimetype = mimetype;
        this.type = type;
        this.url = url;
        this.width = width;
    }

    public AchievementResourceAspectRatio getAspectratio() {
        return aspectratio;
    }

    public void setAspectratio(AchievementResourceAspectRatio aspectratio) {
        this.aspectratio = aspectratio;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
