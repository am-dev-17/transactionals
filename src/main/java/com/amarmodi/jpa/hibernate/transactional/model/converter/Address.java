package com.amarmodi.jpa.hibernate.transactional.model.converter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    private String streetAddress;
}
