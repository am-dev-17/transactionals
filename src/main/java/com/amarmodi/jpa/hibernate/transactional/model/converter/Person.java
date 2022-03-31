package com.amarmodi.jpa.hibernate.transactional.model.converter;


import javax.persistence.*;


@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "UniqueNumberAndStatus", columnNames = {"personNumber", "isActive"}),
        @UniqueConstraint(name = "UniqueSecurityAndDepartment", columnNames = {"securityNumber", "departmentCode"})})
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;
    @Column(unique = true)
    private String email;
    @Column(unique=true)
    private Long personNumber;
    private Boolean isActive;
    private String securityNumber;
    private String departmentCode;


}
