package org.mth3902.aom.model;

import java.math.BigDecimal;

public class Balance {

    private final int remData;
    private final int remSms;
    private final int remMin;
    private final double remMoney;
    private final long endDate;
    private final long startDate;
    private final BigDecimal price;
    private long packageId;

    public Balance(int remData, int remSms, int remMin, double remMoney, Long endDate, Long startDate, BigDecimal price) {
        this.remData = remData;
        this.remSms = remSms;
        this.remMin = remMin;
        this.remMoney = remMoney;
        this.endDate = endDate;
        this.startDate = startDate;
        this.price = price;
    }

    public Balance(int remData, int remSms, int remMin, double remMoney, Long endDate, Long startDate, BigDecimal price, long packageId) {
        this.remData = remData;
        this.remSms = remSms;
        this.remMin = remMin;
        this.remMoney = remMoney;
        this.endDate = endDate;
        this.startDate = startDate;
        this.price = price;
        this.packageId = packageId;
    }

    public long getPackageId() {
        return packageId;
    }

    public int getRemData() {
        return remData;
    }

    public int getRemSms() {
        return remSms;
    }

    public int getRemMin() {
        return remMin;
    }

    public double getRemMoney() {
        return remMoney;
    }

    public Long getEndDate() {
        return endDate;
    }

    public Long getStartDate() {
        return startDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "remData='" + remData + '\'' +
                ", remSms='" + remSms + '\'' +
                ", remMin='" + remMin + '\'' +
                ", remMoney='" + remMoney + '\'' +
                ", endDate='" + endDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
