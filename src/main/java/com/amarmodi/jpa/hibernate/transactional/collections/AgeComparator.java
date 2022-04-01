package com.amarmodi.jpa.hibernate.transactional.collections;

import com.amarmodi.jpa.hibernate.transactional.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        StudentComparator s1=(StudentComparator) o1;
        StudentComparator s2=(StudentComparator)o2;

        if(s1.age == s2.age){
            return 0;
        } else if( s1.age > s2.age){
            return 1;
        } else{
            return -1;
        }
    }

    public static void main(String[] args) {
        ArrayList<StudentComparator> al = new ArrayList<>();

        Collections.sort(al, (o1, o2) ->{
            return o1.age - o2.age;
        });
    }
}
