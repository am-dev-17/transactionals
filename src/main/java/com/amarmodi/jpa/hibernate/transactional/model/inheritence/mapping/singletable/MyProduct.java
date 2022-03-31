package com.amarmodi.jpa.hibernate.transactional.model.inheritence.mapping.singletable;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
public class MyProduct {
    @Id
    private long productId;
    private String name;

}
