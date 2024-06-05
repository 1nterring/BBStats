package com.uep.wap.dto;

import java.sql.Timestamp;

import com.uep.wap.model.Contract;

public class ContractDTO {


    private java.sql.Timestamp expiryDate;

    public Timestamp getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
    }
}
