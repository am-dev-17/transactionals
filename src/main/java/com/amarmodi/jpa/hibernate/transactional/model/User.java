package com.amarmodi.jpa.hibernate.transactional.model;

import com.amarmodi.jpa.hibernate.transactional.entity.manager.AuditTrailListener;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@EntityListeners(AuditTrailListener.class)
@Data
@Slf4j
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String userName;
    private String firstName;
    private String lastName;
    @Transient
    private String fullName;

    @PrePersist
    public void logNewUserAttempt() {
        log.info("Attempting to add new user with username: " + userName);
    }

    @PostPersist
    public void logNewUserAdded() {
        log.info("Added user '" + userName + "' with ID: " + id);
    }

    @PreRemove
    public void logUserRemovalAttempt() {
        log.info("Attempting to delete user: " + userName);
    }

    @PostRemove
    public void logUserRemoval() {
        log.info("Deleted user: " + userName);
    }

    @PreUpdate
    public void logUserUpdateAttempt() {
        log.info("Attempting to update user: " + userName);
    }

    @PostUpdate
    public void logUserUpdate() {
        log.info("Updated user: " + userName);
    }

    @PostLoad
    public void logUserLoad() {
        fullName = firstName + " " + lastName;
    }

}
