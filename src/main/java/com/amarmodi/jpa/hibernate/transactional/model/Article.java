package com.amarmodi.jpa.hibernate.transactional.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name=Article.TABLE_NAME)
public class Article {
    public static final String TABLE_NAME= "ARTICLES";

    @Id
    @GeneratedValue
    private Long id;
}
