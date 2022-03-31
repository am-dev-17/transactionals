package com.amarmodi.jpa.hibernate.transactional.onetoone;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class AddressOneToOne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy = "address")
    private UserOneToOne user;
}
