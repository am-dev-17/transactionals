package com.amarmodi.jpa.hibernate.transactional.collections;

import java.util.*;

public class SetTester {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Ravi");
        stringSet.add("Vijay");
        stringSet.add("Ravi");
        stringSet.add("Ajay");

        Iterator<String> itr = stringSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void mainLinkedHashSet(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Rachel");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void mainTreeSet(String[] args) {
        SortedSet<String> set = new TreeSet();

    }
}
