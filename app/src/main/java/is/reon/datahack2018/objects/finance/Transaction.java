package is.reon.datahack2018.objects.finance;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import is.reon.datahack2018.R;
import is.reon.datahack2018.objects.DigiObjectInterface;

/**
 * Created by gunnar on 23.3.2018.
 */

@RealmClass
public class Transaction extends RealmObject implements DigiObjectInterface {


    @Override
    public long getSortableDate() {
        return transactiondate;
    }

    @Override
    public String getSortableName() {
        return String.valueOf(amount);
    }

    @Override
    public int getListIconDrawable() {
        return R.drawable.glycomic_icon;
    }

    @Override
    public String getListTitle() {
        return null;
    }

    @Override
    public String getListSubtitle() {
        return null;
    }

    @PrimaryKey
    public int id;

    @Expose
    @SerializedName("digiDataSource")
    public int digiDataSource;

    @Expose
    @SerializedName("digiDataSource")
    public int digiDataSourceNumber;

    @Expose
    @SerializedName("accountentityid")
    public String accountentityid;

    @Expose
    @SerializedName("amount")
    public float amount;

    @Expose
    @SerializedName("basetype")
    public String basetype;

    @Expose
    @SerializedName("category")
    public String category;

    @Expose
    @SerializedName("categoryid")
    public int categoryid;

    @Expose
    @SerializedName("categorysource")
    public String categorysource;

    @Expose
    @SerializedName("categorytype")
    public String categorytype;

    @Expose
    @SerializedName("checknumber")
    public String checknumber;

    @Expose
    @SerializedName("consumerref")
    public String consumerref;

    @Expose
    @SerializedName("createddate")
    public long createddate;

    @Expose
    @SerializedName("currency")
    public String currency;

    @Expose
    @SerializedName("entityid")
    public String entityid;

    @Expose
    @SerializedName("highlevelcategoryid")
    public int highlevelcategoryid;

    @Expose
    @SerializedName("id")
    public String transactionId;

    @Expose
    @SerializedName("ismanual")
    public boolean isManual;

    @Expose
    @SerializedName("merchantaddress1")
    public String merchantaddress1;

    @Expose
    @SerializedName("merchantaddress2")
    public String merchantaddress2;

    @Expose
    @SerializedName("merchantcity")
    public String merchantcity;

    @Expose
    @SerializedName("merchantcountry")
    public String merchantcountry;

    @Expose
    @SerializedName("merchantid")
    public String merchantid;

    @Expose
    @SerializedName("merchantname")
    public String merchantname;

    @Expose
    @SerializedName("merchantstate")
    public String merchantstate;

    @Expose
    @SerializedName("merchantzip")
    public String merchantzip;

    @Expose
    @SerializedName("originalref")
    public String originalref;

    @Expose
    @SerializedName("postdate")
    public long postdate;

    @Expose
    @SerializedName("runningbalance")
    public float runningbalance;

    @Expose
    @SerializedName("runningbalancecurrency")
    public String runningbalancecurrency;

    @Expose
    @SerializedName("simpleref")
    public String simpleref;

    @Expose
    @SerializedName("status")
    public String status;

    @Expose
    @SerializedName("subtype")
    public String subtype;

    @Expose
    @SerializedName("transactiondate")
    public long transactiondate;

    @Expose
    @SerializedName("type")
    public String type;


    public Transaction() {}

    public Transaction(String accountentityid, float amount, String basetype, String category, int categoryid, String categorysource, String categorytype, String checknumber, String consumerref, long createddate, String currency, String entityid, int highlevelcategoryid, String transactionId, boolean isManual, String merchantaddress1, String merchantaddress2, String merchantcity, String merchantcountry, String merchantid, String merchantname, String merchantstate, String merchantzip, String originalref, long postdate, float runningbalance, String runningbalancecurrency, String simpleref, String status, String subtype, long transactiondate, String type) {
        this.accountentityid = accountentityid;
        this.amount = amount;
        this.basetype = basetype;
        this.category = category;
        this.categoryid = categoryid;
        this.categorysource = categorysource;
        this.categorytype = categorytype;
        this.checknumber = checknumber;
        this.consumerref = consumerref;
        this.createddate = createddate;
        this.currency = currency;
        this.entityid = entityid;
        this.highlevelcategoryid = highlevelcategoryid;
        this.transactionId = transactionId;
        this.isManual = isManual;
        this.merchantaddress1 = merchantaddress1;
        this.merchantaddress2 = merchantaddress2;
        this.merchantcity = merchantcity;
        this.merchantcountry = merchantcountry;
        this.merchantid = merchantid;
        this.merchantname = merchantname;
        this.merchantstate = merchantstate;
        this.merchantzip = merchantzip;
        this.originalref = originalref;
        this.postdate = postdate;
        this.runningbalance = runningbalance;
        this.runningbalancecurrency = runningbalancecurrency;
        this.simpleref = simpleref;
        this.status = status;
        this.subtype = subtype;
        this.transactiondate = transactiondate;
        this.type = type;
    }

    public Transaction(int id, int digiDataSource, int digiDataSourceNumber, String accountentityid, float amount, String basetype, String category, int categoryid, String categorysource, String categorytype, String checknumber, String consumerref, long createddate, String currency, String entityid, int highlevelcategoryid, String transactionId, boolean isManual, String merchantaddress1, String merchantaddress2, String merchantcity, String merchantcountry, String merchantid, String merchantname, String merchantstate, String merchantzip, String originalref, long postdate, float runningbalance, String runningbalancecurrency, String simpleref, String status, String subtype, long transactiondate, String type) {
        this.id = id;
        this.digiDataSource = digiDataSource;
        this.digiDataSourceNumber = digiDataSourceNumber;
        this.accountentityid = accountentityid;
        this.amount = amount;
        this.basetype = basetype;
        this.category = category;
        this.categoryid = categoryid;
        this.categorysource = categorysource;
        this.categorytype = categorytype;
        this.checknumber = checknumber;
        this.consumerref = consumerref;
        this.createddate = createddate;
        this.currency = currency;
        this.entityid = entityid;
        this.highlevelcategoryid = highlevelcategoryid;
        this.transactionId = transactionId;
        this.isManual = isManual;
        this.merchantaddress1 = merchantaddress1;
        this.merchantaddress2 = merchantaddress2;
        this.merchantcity = merchantcity;
        this.merchantcountry = merchantcountry;
        this.merchantid = merchantid;
        this.merchantname = merchantname;
        this.merchantstate = merchantstate;
        this.merchantzip = merchantzip;
        this.originalref = originalref;
        this.postdate = postdate;
        this.runningbalance = runningbalance;
        this.runningbalancecurrency = runningbalancecurrency;
        this.simpleref = simpleref;
        this.status = status;
        this.subtype = subtype;
        this.transactiondate = transactiondate;
        this.type = type;
    }

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

    public String getAccountentityid() {
        return accountentityid;
    }

    public void setAccountentityid(String accountentityid) {
        this.accountentityid = accountentityid;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getBasetype() {
        return basetype;
    }

    public void setBasetype(String basetype) {
        this.basetype = basetype;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategorysource() {
        return categorysource;
    }

    public void setCategorysource(String categorysource) {
        this.categorysource = categorysource;
    }

    public String getCategorytype() {
        return categorytype;
    }

    public void setCategorytype(String categorytype) {
        this.categorytype = categorytype;
    }

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }

    public String getConsumerref() {
        return consumerref;
    }

    public void setConsumerref(String consumerref) {
        this.consumerref = consumerref;
    }

    public long getCreateddate() {
        return createddate;
    }

    public void setCreateddate(long createddate) {
        this.createddate = createddate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getEntityid() {
        return entityid;
    }

    public void setEntityid(String entityid) {
        this.entityid = entityid;
    }

    public int getHighlevelcategoryid() {
        return highlevelcategoryid;
    }

    public void setHighlevelcategoryid(int highlevelcategoryid) {
        this.highlevelcategoryid = highlevelcategoryid;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public String getMerchantaddress1() {
        return merchantaddress1;
    }

    public void setMerchantaddress1(String merchantaddress1) {
        this.merchantaddress1 = merchantaddress1;
    }

    public String getMerchantaddress2() {
        return merchantaddress2;
    }

    public void setMerchantaddress2(String merchantaddress2) {
        this.merchantaddress2 = merchantaddress2;
    }

    public String getMerchantcity() {
        return merchantcity;
    }

    public void setMerchantcity(String merchantcity) {
        this.merchantcity = merchantcity;
    }

    public String getMerchantcountry() {
        return merchantcountry;
    }

    public void setMerchantcountry(String merchantcountry) {
        this.merchantcountry = merchantcountry;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    public String getMerchantname() {
        return merchantname;
    }

    public void setMerchantname(String merchantname) {
        this.merchantname = merchantname;
    }

    public String getMerchantstate() {
        return merchantstate;
    }

    public void setMerchantstate(String merchantstate) {
        this.merchantstate = merchantstate;
    }

    public String getMerchantzip() {
        return merchantzip;
    }

    public void setMerchantzip(String merchantzip) {
        this.merchantzip = merchantzip;
    }

    public String getOriginalref() {
        return originalref;
    }

    public void setOriginalref(String originalref) {
        this.originalref = originalref;
    }

    public long getPostdate() {
        return postdate;
    }

    public void setPostdate(long postdate) {
        this.postdate = postdate;
    }

    public float getRunningbalance() {
        return runningbalance;
    }

    public void setRunningbalance(float runningbalance) {
        this.runningbalance = runningbalance;
    }

    public String getRunningbalancecurrency() {
        return runningbalancecurrency;
    }

    public void setRunningbalancecurrency(String runningbalancecurrency) {
        this.runningbalancecurrency = runningbalancecurrency;
    }

    public String getSimpleref() {
        return simpleref;
    }

    public void setSimpleref(String simpleref) {
        this.simpleref = simpleref;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public long getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(long transactiondate) {
        this.transactiondate = transactiondate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
