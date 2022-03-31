package com.amarmodi.jpa.hibernate.transactional.model.onemany;

import javax.persistence.*;

@Entity
@Table(name="ITEMS")
public class Items {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Cart cart;
}
