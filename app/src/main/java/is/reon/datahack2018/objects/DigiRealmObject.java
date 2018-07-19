package is.reon.datahack2018.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public abstract class DigiRealmObject extends RealmObject implements DigiObjectInterface {

    @PrimaryKey
    public int id;

    @Expose
    @SerializedName("digiDataSource")
    public int digiDataSource;

    @Expose
    @SerializedName("digiDataSource")
    public int digiDataSourceNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDigiDataSource() {
        return digiDataSource;
    }

    public void setDigiDataSource(int digiDataSource) {
        this.digiDataSource = digiDataSource;
    }

    public int getDigiDataSourceNumber() {
        return digiDataSourceNumber;
    }

    public void setDigiDataSourceNumber(int digiDataSourceNumber) {
        this.digiDataSourceNumber = digiDataSourceNumber;
    }
}
