package com.amarmodi.jpa.hibernate.transactional.model.compositeid;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(AccountId.class)
@Data
public class Account {
    @Id
    private String accountNumber;

    @Id
    private String accountType;
}
