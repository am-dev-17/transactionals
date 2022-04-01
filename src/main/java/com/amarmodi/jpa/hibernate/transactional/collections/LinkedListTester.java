package com.amarmodi.jpa.hibernate.transactional.collections;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class LinkedListTester {

    public static void mainAdd(String[] args) {
//        In Java LinkedList class, manipulation is fast because no shifting needs to occur.
//                Java LinkedList class can be used as a list, stack or queue.

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add(1, "Gaurav");

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Sonoo");
        ll2.add("Hanumant");
        ll.addAll(ll2);
        ll.addFirst("Lokesh");
        System.out.println("After invoking addFirst(E e) method: "+ll);
        //Adding an element at the last position
        ll.addLast("Harsh");

    }

    public static void mainRemove(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add("Anuj");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Virat");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Amit");


        ll.remove("Vijay");
        //Removing element on the basis of specific position
        ll.remove(0);

        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("Ravi");
        ll2.add("Hanumat");

        // Adding new elements to arraylist
        ll.addAll(ll2);
        System.out.println("Updated list : "+ll);
        //Removing all the new elements from arraylist
        ll.removeAll(ll2);
        System.out.println("After invoking removeAll() method: "+ll);

        ll.removeFirst();
        System.out.println("After invoking removeFirst() method: "+ll);

        ll.removeLast();

    }


    public static void mainString(String[] args) {
        String val = "Help";
        char[] chars = val.toCharArray();
        for(int i= 0; i< chars.length/2;i++){
            char p = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = p;
        }

        System.out.println(new String(chars));
    }

    public static void main333(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");

//        Iterator i=ll.descendingIterator();
//        while(i.hasNext())
//        {
//            System.out.println(i.next());
//        }

        for(int j= ll.size()-1; j >=0; j-- ) {
            System.out.println(ll.get(j));
        }
    }

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");

        System.out.println("head:"+queue.peek());

        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();
    }
}
