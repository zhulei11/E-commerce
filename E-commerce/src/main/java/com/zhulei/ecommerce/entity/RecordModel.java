package com.zhulei.ecommerce.entity;

import com.zhulei.ecommerce.enums.TransactionTypeEnum;

import java.net.Inet4Address;
import java.util.Date;

/**
 * @author ZhuLei
 * @datetime 2023/2/16 20:59
 */
public class RecordModel {
    private Long recordId;
    private Long walletId;
    private Double fee;
    private String orderNum;
    private Integer transactionType;
    private Long createdBy;
    private Date createdDate;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getWalletId() {
        return walletId;
    }

    public void setWalletId(Long walletId) {
        this.walletId = walletId;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
