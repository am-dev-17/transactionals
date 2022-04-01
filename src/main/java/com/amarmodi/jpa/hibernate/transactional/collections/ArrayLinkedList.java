package com.amarmodi.jpa.hibernate.transactional.collections;

import java.util.*;

public class ArrayLinkedList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ravi");
        linkedList.add("Vijay");
        linkedList.add("Ravi");
        linkedList.add("Ajay");

        Iterator<String> itr = linkedList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void mainStack(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("world");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void mainQueue(String[] args) {
        Queue<String> q1 = new PriorityQueue();
        Queue<String> pq = new PriorityQueue<String>();
        pq.add("Amit Sharma");
        pq.add("Vijay Raj");
        pq.add("JaiShankar");
        pq.add("Raj");

        System.out.println("head:"+pq.peek());
        System.out.println("iterating the queue elements:");

        Iterator<String> itr = pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        pq.remove();
        pq.poll();
    }

    public static void mainDeque(String[] args) {
        Deque d = new ArrayDeque();
        //Dequeue allows us to add and remove from both sides
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
//Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
