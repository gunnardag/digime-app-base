package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by gunnar on 19.7.2018.
 */

public class Coding extends RealmObject {

    @SerializedName("system")
    public String system;

    @SerializedName("code")
    public String code;

    @SerializedName("display")
    public String display;
}
