package com.amarmodi.jpa.hibernate.transactional.model.inheritence.mapping.singletable;

import javax.persistence.Entity;

@Entity
public class Book extends MyProduct {
    private String author;
}