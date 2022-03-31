package com.amarmodi.jpa.hibernate.transactional;

public class Looper {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }

    public static void ford(String[] args){
        int arr[] = {1,2,3,4,5,6,8};
        for(int num: arr) {
            System.out.println(num);
        }
    }


    public static void whiled(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}
