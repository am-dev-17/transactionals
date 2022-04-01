package com.amarmodi.jpa.hibernate.transactional.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Book implements Comparable<Book> {

    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book o) {
        if(id > o.id){
            return 1;
        } else if (id < o.id) {
            return -1;
        } else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Queue<Book> queue = new PriorityQueue<>();
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

        queue.add(b1);
        queue.add(b2);
        queue.add(b3);

        for(Book b: queue){
            System.out.println(b);
            queue.remove();
        }
    }



}
