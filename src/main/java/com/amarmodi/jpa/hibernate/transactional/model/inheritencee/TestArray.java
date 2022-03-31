package com.amarmodi.jpa.hibernate.transactional.model.inheritencee;

import java.util.Arrays;
import java.util.List;

public class TestArray {

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0]=10;//initialization
        array[1]=20;
        array[2]=70;
        array[3]=40;
        array[4]=50;

        for(int i = 0; i< array.length; i++){
            array[i] = i;
        }

        int[] a = {1,2,3,46};

        for(int num : array){
            System.out.println(num);
        }


    }
    public static void mains(String[] args) {
        //declaring a source array
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        //declaring a destination array
        char[] copyTo = new char[7];
        //copying array using System.arraycopy() method
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        //printing the destination array
        System.out.println(String.valueOf(copyTo));
    }
    public static void mainArrays(String[] args)
    {
//defining an array of integer type
        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
//invoking sort() method of the Arrays class
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
//prints array using the for loop
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        Integer[] spam = new Integer[] { 1, 2, 3 };
        List<Integer> list = Arrays.asList(spam);
    }

}
