package com.amarmodi.jpa.hibernate.transactional.model.inheritence.mapping;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data //  In the DB one table with all of the fields will be present
public class MyEmployeeMappedSuperClass extends PersonMappedSuperclass {
    private String company;
    // constructor, getters, setters 
}