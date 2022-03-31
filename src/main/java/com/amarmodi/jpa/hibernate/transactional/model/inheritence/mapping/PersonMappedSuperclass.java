package com.amarmodi.jpa.hibernate.transactional.model.inheritence.mapping;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class PersonMappedSuperclass {

    @Id
    private long personId;
    private String name;
}
