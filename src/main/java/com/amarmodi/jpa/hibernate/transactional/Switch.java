package com.amarmodi.jpa.hibernate.transactional;

public class Switch {

    public static void main(String[] args) {

        Integer ex = 4;
        switch (ex) {
            case 2:
                System.out.println(ex);
                break;
            case 4:
                System.out.println(ex);
                System.out.println(4);
                break;
            default:
                System.out.println("This is default");
        }
    }
}
