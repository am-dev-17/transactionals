package com.amarmodi.jpa.hibernate.transactional.model.compositeid;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountId implements Serializable {

    private String accountNumber;
    private String accountType;

    public AccountId(String accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }
}
