package com.amarmodi.jpa.hibernate.transactional.model.onemany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table

public class Cart {

    @Id
    private Long id;


    @OneToMany(mappedBy="cart")
    private Set<Items> items;
}
