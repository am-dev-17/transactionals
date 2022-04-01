package com.amarmodi.jpa.hibernate.transactional.collections;

import com.amarmodi.jpa.hibernate.transactional.model.Student;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort implements Comparable<StudentSort>{
    public String name;

    public StudentSort(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(StudentSort o) {
        return this.name.compareTo(o.name);
    }


    public static void main(String[] args) {
        ArrayList<StudentSort> al = new ArrayList<>();
        al.add(new StudentSort("Viru"));
        al.add(new StudentSort("Saurav"));
        al.add(new StudentSort("Mukesh"));
        al.add(new StudentSort("Tahir"));

        Collections.sort(al);

        al.forEach(
                item ->{
                    System.out.println(item);
                }
        );
    }

    @Override
    public String toString() {
        return "StudentSort{" +
                "name='" + name + '\'' +
                '}';
    }
}
