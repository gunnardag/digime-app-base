package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by gunnar on 19.7.2018.
 */

public class Category extends RealmObject {

    @SerializedName("name")
    public String name;

    @SerializedName("codings")
    public RealmList<Coding> codings;
}
