package com.amarmodi.jpa.hibernate.transactional.collections;

public class StudentComparator {

    int rollno;
    String name;
    int age;

    StudentComparator(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
