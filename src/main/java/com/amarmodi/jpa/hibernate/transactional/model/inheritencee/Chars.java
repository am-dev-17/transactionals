package com.amarmodi.jpa.hibernate.transactional.model.inheritencee;

public class Chars {

    public static void main(String args[]){
        char[] chars = {'a','b','c', 'd', 'e'};
        String string = new String(chars);
//        String s="javatpoint";
        String s1="Welcome";
        String s2="Welcome";//It doesn't create a new instance

        String s="Sachin";
        String t = s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects
        System.out.println(t);
    }

    public static void main2(String args[]){
        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        String s4="Saurav";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        "Amar".equals("Amar");

    }

    public static void main3(String args[]){
        String s1="Sachin";
        String s2="Sachin";
        String s3="Ratan";
        System.out.println(s1.compareTo(s3));
//        left greater? then 1    and if right greater -1 and if equal 0
        String s="hello";
        System.out.println(s.substring(0,2)); //returns he  as a substring
    }
}
