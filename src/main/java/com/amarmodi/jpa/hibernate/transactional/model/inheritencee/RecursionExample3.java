package com.amarmodi.jpa.hibernate.transactional.model.inheritencee;

public class RecursionExample3 {
    static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    static int fac(int n){
        if(n ==1){
            return 1;
        } else{
            return (n *fac(n-1));
        }
    }

    public static void main(String[] args) {
//        int numb = RecursionExample3.fac(5);
//        System.out.println(numb);

//        int fibNumber = fibonacci(10);
//        System.out.println(fibNumber);

        int fibNumber = fibonacci_noRec(10);
        System.out.println(fibNumber);
    }


    static int fibonacci(int num){
        if( num <2){
            return num;
        }
        return fibonacci(num -1) + fibonacci(num -2);
    }

    static int fibonacci_noRec(int num){
        int n1 = 0;
        int n2 = 1;
        int nCurr = 0;
        if(num <2){
            return num;
        }

        for(int i = 2; i<= num ;i++){
            nCurr = n1 + n2;
            n1 = n2;
            n2 = nCurr;
        }

        return nCurr;
    }


}