package com.amarmodi.jpa.hibernate.transactional.model.cascadetypes;

import org.hibernate.Hibernate;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void whenParentSavedThenChildSaved() {
        Person person = new Person();
        Address address = new Address();
        address.setPerson(person);
        person.setAddresses(Arrays.asList(address));
//        session.persist(person);
//        session.flush();
//        session.clear();
    }

//    Hibernate: insert into Person (name, id) values (?, ?)
//    Hibernate: insert into Address (
//            city, houseNumber, person_id, street, zipCode, id) values (?, ?, ?, ?, ?, ?)


//    The merge operation copies the state of the given object onto the persistent object with the same identifier. CascadeType.MERGE propagates the merge operation from a parent to a child entity.
//
//    Let's test the merge operation:

    @Test
    public void whenParentSavedThenMerged() {
        int addressId;
//        Person person = buildPerson("devender");
//        Address address = buildAddress(person);
//        person.setAddresses(Arrays.asList(address));
//        session.persist(person);
//        session.flush();
//        addressId = address.getId();
//        session.clear();
//
//        Address savedAddressEntity = session.find(Address.class, addressId);
//        Person savedPersonEntity = savedAddressEntity.getPerson();
//        savedPersonEntity.setName("devender kumar");
//        savedAddressEntity.setHouseNumber(24);
//        session.merge(savedPersonEntity);
//        session.flush();
    }

}