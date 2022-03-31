package com.amarmodi.jpa.hibernate.transactional.model.multimapping;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "allergens")
@Data
class AllergensSimple {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meal_id")
    Long mealId;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "meal_id")
    MealSimple meal;

    @Column(name = "peanuts")
    boolean peanuts;

    @Column(name = "celery")
    boolean celery;

    @Column(name = "sesame_seeds")
    boolean sesameSeeds;

    // standard getters and setters
}