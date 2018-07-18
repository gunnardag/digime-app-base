package is.reon.datahack2018.objects.health;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gunnar on 6.3.2018.
 */

public class Medication extends RealmObject {

    @PrimaryKey
    public long id;

    @Expose
    @SerializedName("atccode")
    public String AtcCode;

    @Expose
    @SerializedName("autoseponate")
    public String AutoSeponate;

    @Expose
    @SerializedName("conceptcode")
    public int ConceptCode;

    @Expose
    @SerializedName("createddate")
    public long CreatedDate;

    @Expose
    @SerializedName("daysleft")
    public String DaysLeft;

    @Expose
    @SerializedName("directions")
    public String Directions;

    @Expose
    @SerializedName("form")
    public String Form;

    @Expose
    @SerializedName("lastchanged")
    public long LastChanged;

    @Expose
    @SerializedName("lastprescribed")
    public long LastPrescribed;

    @Expose
    @SerializedName("name")
    public String Name;

    @Expose
    @SerializedName("nrnorr")
    public String NrNorr;

    @Expose
    @SerializedName("numberofpackings")
    public int NumberOfPackings;

    @Expose
    @SerializedName("numberoftimes")
    public String NumberOfTimes;

    @Expose
    @SerializedName("onetimeonly")
    public boolean OneTimeOnly;

    @Expose
    @SerializedName("prescriptionends")
    public long PrescriptionEnds;

    @Expose
    @SerializedName("quantity")
    public String Quantity;

    @Expose
    @SerializedName("skammtaaskja")
    public String Skammtaaskja;

    @Expose
    @SerializedName("strength")
    public String Strength;

    @Expose
    @SerializedName("totalquantity")
    public String TotalQuantity;

    @Expose
    @SerializedName("usedfor")
    public String UsedFor;

    @Expose
    @SerializedName("entityid")
    public String EntityId;

    public Medication(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAtcCode() {
        return AtcCode;
    }

    public void setAtcCode(String atcCode) {
        AtcCode = atcCode;
    }

    public String getAutoSeponate() {
        return AutoSeponate;
    }

    public void setAutoSeponate(String autoSeponate) {
        AutoSeponate = autoSeponate;
    }

    public int getConceptCode() {
        return ConceptCode;
    }

    public void setConceptCode(int conceptCode) {
        ConceptCode = conceptCode;
    }

    public long getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(long createdDate) {
        CreatedDate = createdDate;
    }

    public String getDaysLeft() {
        return DaysLeft;
    }

    public void setDaysLeft(String daysLeft) {
        DaysLeft = daysLeft;
    }

    public String getDirections() {
        return Directions;
    }

    public void setDirections(String directions) {
        Directions = directions;
    }

    public String getForm() {
        return Form;
    }

    public void setForm(String form) {
        Form = form;
    }

    public long getLastChanged() {
        return LastChanged;
    }

    public void setLastChanged(long lastChanged) {
        LastChanged = lastChanged;
    }

    public long getLastPrescribed() {
        return LastPrescribed;
    }

    public void setLastPrescribed(long lastPrescribed) {
        LastPrescribed = lastPrescribed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNrNorr() {
        return NrNorr;
    }

    public void setNrNorr(String nrNorr) {
        NrNorr = nrNorr;
    }

    public int getNumberOfPackings() {
        return NumberOfPackings;
    }

    public void setNumberOfPackings(int numberOfPackings) {
        NumberOfPackings = numberOfPackings;
    }

    public String getNumberOfTimes() {
        return NumberOfTimes;
    }

    public void setNumberOfTimes(String numberOfTimes) {
        NumberOfTimes = numberOfTimes;
    }

    public boolean isOneTimeOnly() {
        return OneTimeOnly;
    }

    public void setOneTimeOnly(boolean oneTimeOnly) {
        OneTimeOnly = oneTimeOnly;
    }

    public long getPrescriptionEnds() {
        return PrescriptionEnds;
    }

    public void setPrescriptionEnds(long prescriptionEnds) {
        PrescriptionEnds = prescriptionEnds;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getSkammtaaskja() {
        return Skammtaaskja;
    }

    public void setSkammtaaskja(String skammtaaskja) {
        Skammtaaskja = skammtaaskja;
    }

    public String getStrength() {
        return Strength;
    }

    public void setStrength(String strength) {
        Strength = strength;
    }

    public String getTotalQuantity() {
        return TotalQuantity;
    }

    public void setTotalQuantity(String totalQuantity) {
        TotalQuantity = totalQuantity;
    }

    public String getUsedFor() {
        return UsedFor;
    }

    public void setUsedFor(String usedFor) {
        UsedFor = usedFor;
    }

    public String getEntityId() {
        return EntityId;
    }

    public void setEntityId(String entityId) {
        EntityId = entityId;
    }
}
