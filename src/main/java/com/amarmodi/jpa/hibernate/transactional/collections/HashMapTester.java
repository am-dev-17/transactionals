package com.amarmodi.jpa.hibernate.transactional.collections;

import java.util.*;

public class HashMapTester {

    public static void mainEntrySet(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Amit");
        map.put(2, "Rahul");
        map.put(5, "Jai");
        map.put(4, "Amit");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
//        Iterator itr = set.iterator();
//        while(itr.hasNext()){
//            Map.Entry entry = (Map.Entry) itr.next();
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        map.entrySet().forEach(
                e -> {
                    System.out.println(e.getKey() + " " + e.getValue());
                }
        );
    }

    public static void main67(String[] args) {
//        comparingByKey()
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.remove(100);

        map.forEach(
                (k,v) ->{
                    System.out.println(k + " " + v);
                }
        );

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> {
                    System.out.println(e.getKey() + " " + e.getValue());
                });
    }


    public static void main(String[] args) {
//Sorting collections
        ArrayList<String> al = new ArrayList<>();
        al.add("viru");
        al.add("saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al);
//        al.forEach(
//                System.out::println
//        );
//

        Collections.sort(al, Collections.reverseOrder());
        al.forEach(
                System.out::println
        );


    }
}
