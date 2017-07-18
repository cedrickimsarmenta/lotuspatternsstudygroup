package com.lambda.csv;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by diannesolano on 18/07/2017.
 */
public class SampleBean {
    @CsvField(header = "CustomerID", order = 1, type = CsvObjectTypes.NUMERIC)
    private long accountId;

    @CsvField(header = "Mobile Number", order = 3, type = CsvObjectTypes.STRING)
    private String mobileNo;

    @CsvField(header = "Balance", order = 4, type = CsvObjectTypes.MONEY)
    private BigDecimal balance;

    @CsvField(header = "Date", order = 2, type = CsvObjectTypes.DATE)
    private Date sampleDate;

    @CsvField(header = "Username", order = 5, type = CsvObjectTypes.STRING)
    private String userName;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }


    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getSampleDate() {
        return sampleDate;
    }

    public void setSampleDate(Date sampleDate) {
        this.sampleDate = sampleDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
