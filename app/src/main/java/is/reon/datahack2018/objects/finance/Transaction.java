package is.reon.datahack2018.objects.finance;

import com.google.gson.annotations.SerializedName;

import is.reon.datahack2018.objects.DigiRealmObject;

/**
 * Created by gunnar on 23.3.2018.
 */

public class Transaction extends DigiRealmObject {

    @SerializedName("accountentityid")
    public String accountentityid;

    @SerializedName("amount")
    public float amount;

    @SerializedName("basetype")
    public String basetype;

    @SerializedName("category")
    public String category;

    @SerializedName("categoryid")
    public int categoryid;

    @SerializedName("categorysource")
    public String categorysource;

    @SerializedName("categorytype")
    public String categorytype;

    @SerializedName("checknumber")
    public String checknumber;

    @SerializedName("consumerref")
    public String consumerref;

    @SerializedName("createddate")
    public long createddate;

    @SerializedName("currency")
    public String currency;

    @SerializedName("entityid")
    public String entityid;

    @SerializedName("highlevelcategoryid")
    public int highlevelcategoryid;

    @SerializedName("id")
    public String transactionId;

    @SerializedName("ismanual")
    public boolean isManual;

    @SerializedName("merchantaddress1")
    public String merchantaddress1;

    @SerializedName("merchantaddress2")
    public String merchantaddress2;

    @SerializedName("merchantcity")
    public String merchantcity;

    @SerializedName("merchantcountry")
    public String merchantcountry;

    @SerializedName("merchantid")
    public String merchantid;

    @SerializedName("merchantname")
    public String merchantname;

    @SerializedName("merchantstate")
    public String merchantstate;

    @SerializedName("merchantzip")
    public String merchantzip;

    @SerializedName("originalref")
    public String originalref;

    @SerializedName("postdate")
    public long postdate;

    @SerializedName("runningbalance")
    public float runningbalance;

    @SerializedName("runningbalancecurrency")
    public String runningbalancecurrency;

    @SerializedName("simpleref")
    public String simpleref;

    @SerializedName("status")
    public String status;

    @SerializedName("subtype")
    public String subtype;

    @SerializedName("transactiondate")
    public long transactiondate;

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


    @Override
    public long getCreatedDate() {
        return transactiondate;
    }

    @Override
    public String getName() {
        return String.valueOf(amount);
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
