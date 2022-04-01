package com.amarmodi.jpa.hibernate.transactional.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

    public static void main3(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            String name = (String)itr.next();
            System.out.println(name);
        }
    }

    public static void main33(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Grapes");
        fruitList.add("Apple");

        System.out.println(fruitList);
//        for(String fruit: fruitList) {
//            System.out.println(fruit);
//        }

        fruitList.stream()
                .forEach(
                        fruit -> {
                            System.out.println(fruit);
                        }
                );

        fruitList.set(1, "Dates");
    }

    public static void mainSort(String[] args) {
        //Sorting an array
        List<String> list1=new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");

        Collections.sort(list1);
        for(int i=0; i< list1.size();i++){
            String cur = list1.get(i);
//            System.out.println(cur);
        }

//        Sorting numbers
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        Collections.sort(list2);

        for(Integer number: list2){
            System.out.println(number);
        }
    }

    public static void maini(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

//        List Iterator

    }

    public static void mainRemove(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add("Anuj");
        al.add("Gaurav");

        al.remove("Vijay");
        al.remove(0);
    }

    public static void mainIsEmpty(String[] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        System.out.println("Is ArrayList Empty: "+al.isEmpty());
    }


}
