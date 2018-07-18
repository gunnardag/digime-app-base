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

public class Achievement extends RealmObject {

    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("id")
    public String AchievementId;

    @Expose
    @SerializedName("accountentityid")
    public String Accountentityid;

    @Expose
    @SerializedName("gradientendcolor")
    public String GradientEndColor;

    @Expose
    @SerializedName("gradientstartcolor")
    public String GradientStartColor;

    @Expose
    @SerializedName("type")
    public String Type;

    @Expose
    @SerializedName("category")
    public String Category;

    @Expose
    @SerializedName("description")
    public String Description;

    @Expose
    @SerializedName("earnedmessage")
    public String EarnedMessage;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    @Expose
    @SerializedName("marketingdescription")
    public String MarketingDescription;

    @Expose
    @SerializedName("mobiledescription")
    public String MobileDescription;

    @Expose
    @SerializedName("name")
    public String Name;

    @Expose
    @SerializedName("resources")
    public RealmList<AchievementResource> Resources;

    @Expose
    @SerializedName("sharetext")
    public String Sharetext;

    @Expose
    @SerializedName("shortdescription")
    public String ShortDescription;

    @Expose
    @SerializedName("shortname")
    public String ShortName;

    @Expose
    @SerializedName("timesachieved")
    public int TimesAchieved;

    @Expose
    @SerializedName("updateddate")
    public long UpdatedDate;

    @Expose
    @SerializedName("value")
    public int Value;

    public Achievement() {}

    public Achievement(String achievementId, String accountentityid, String gradientEndColor, String gradientStartColor, String type, String category, String description, String earnedMessage, String entityId, String marketingDescription, String mobileDescription, String name, RealmList<AchievementResource> resources, String sharetext, String shortDescription, String shortName, int timesAchieved, long updatedDate, int value) {
        AchievementId = achievementId;
        Accountentityid = accountentityid;
        GradientEndColor = gradientEndColor;
        GradientStartColor = gradientStartColor;
        Type = type;
        Category = category;
        Description = description;
        EarnedMessage = earnedMessage;
        EntityId = entityId;
        MarketingDescription = marketingDescription;
        MobileDescription = mobileDescription;
        Name = name;
        Resources = resources;
        Sharetext = sharetext;
        ShortDescription = shortDescription;
        ShortName = shortName;
        TimesAchieved = timesAchieved;
        UpdatedDate = updatedDate;
        Value = value;
    }

    public Achievement(long id, String achievementId, String accountentityid, String gradientEndColor, String gradientStartColor, String type, String category, String description, String earnedMessage, String entityId, String marketingDescription, String mobileDescription, String name, RealmList<AchievementResource> resources, String sharetext, String shortDescription, String shortName, int timesAchieved, long updatedDate, int value) {
        this.id = id;
        AchievementId = achievementId;
        Accountentityid = accountentityid;
        GradientEndColor = gradientEndColor;
        GradientStartColor = gradientStartColor;
        Type = type;
        Category = category;
        Description = description;
        EarnedMessage = earnedMessage;
        EntityId = entityId;
        MarketingDescription = marketingDescription;
        MobileDescription = mobileDescription;
        Name = name;
        Resources = resources;
        Sharetext = sharetext;
        ShortDescription = shortDescription;
        ShortName = shortName;
        TimesAchieved = timesAchieved;
        UpdatedDate = updatedDate;
        Value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAchievementId() {
        return AchievementId;
    }

    public void setAchievementId(String achievementId) {
        AchievementId = achievementId;
    }

    public String getAccountentityid() {
        return Accountentityid;
    }

    public void setAccountentityid(String accountentityid) {
        Accountentityid = accountentityid;
    }

    public String getGradientEndColor() {
        return GradientEndColor;
    }

    public void setGradientEndColor(String gradientEndColor) {
        GradientEndColor = gradientEndColor;
    }

    public String getGradientStartColor() {
        return GradientStartColor;
    }

    public void setGradientStartColor(String gradientStartColor) {
        GradientStartColor = gradientStartColor;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getEarnedMessage() {
        return EarnedMessage;
    }

    public void setEarnedMessage(String earnedMessage) {
        EarnedMessage = earnedMessage;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }

    public String getMarketingDescription() {
        return MarketingDescription;
    }

    public void setMarketingDescription(String marketingDescription) {
        MarketingDescription = marketingDescription;
    }

    public String getMobileDescription() {
        return MobileDescription;
    }

    public void setMobileDescription(String mobileDescription) {
        MobileDescription = mobileDescription;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public RealmList<AchievementResource> getResources() {
        return Resources;
    }

    public void setResources(RealmList<AchievementResource> resources) {
        Resources = resources;
    }

    public String getSharetext() {
        return Sharetext;
    }

    public void setSharetext(String sharetext) {
        Sharetext = sharetext;
    }

    public String getShortDescription() {
        return ShortDescription;
    }

    public void setShortDescription(String shortDescription) {
        ShortDescription = shortDescription;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String shortName) {
        ShortName = shortName;
    }

    public int getTimesAchieved() {
        return TimesAchieved;
    }

    public void setTimesAchieved(int timesAchieved) {
        TimesAchieved = timesAchieved;
    }

    public long getUpdatedDate() {
        return UpdatedDate;
    }

    public void setUpdatedDate(long updatedDate) {
        UpdatedDate = updatedDate;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }
}
