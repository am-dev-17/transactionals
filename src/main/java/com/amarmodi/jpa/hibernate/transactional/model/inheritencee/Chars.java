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

    public static void main4(String args[]) {
        String name = "what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("hello"));
    }

    public static void main5(String args[]){
        String name="sonoo";
        String sf1=String.format("name is %s",name);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
    }

    public static void main6(String args[]){
        String s1="";
        String s2="javatpoint";

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
    }


    public static void main7(String args[]){
        String joinString1=String.join("-","welcome","to","javatpoint");
        System.out.println(joinString1);
    }

    public static void main8(String args[]){
        String s1="javatpoint is a very good website";
        String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'
        System.out.println(replaceString);
    }

    public static void main9(String[] args) {
        String s1 = "Welcome to Javatpoint";
        char[] ch = s1.toCharArray();
        int len = ch.length;
        System.out.println("Char Array length: " + len);
        System.out.println("Char Array elements: ");
        for (int i = 0; i < len; i++) {
            System.out.println(ch[i]);
        }
    }

    public static void mainClass(String args[]) throws Exception {
        Class c=Class.forName("Simple");
        System.out.println(c.getName());
    }
}
