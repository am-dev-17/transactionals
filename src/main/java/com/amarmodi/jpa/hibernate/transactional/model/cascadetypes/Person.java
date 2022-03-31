package com.amarmodi.jpa.hibernate.transactional.model.cascadetypes;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

//CascadeType.ALL propagates all operations — including Hibernate-specific ones — from a parent to a child entity.
@Entity
@Data
public class Person {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String name;
        @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
        private List<Address> addresses;
}
