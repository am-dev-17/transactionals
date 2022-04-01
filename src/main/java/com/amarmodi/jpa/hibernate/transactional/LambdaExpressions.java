package com.amarmodi.jpa.hibernate.transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressions {

    public static void main3(String[] args) {
        int width= 10;
        Drawable d2 = () -> {
          System.out.println("Drawing " + width);
        };
    }

    public static void mainforeach(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(
                (n) -> System.out.println(n)
        );
    }

   static class Product{
        int id;
        String name;
        float price;
        public Product(int id, String name, float price) {
            super();
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"Samsung A5",17000f));
        list.add(new Product(3,"Iphone 6S",65000f));
        list.add(new Product(2,"Sony Xperia",25000f));
        list.add(new Product(4,"Nokia Lumia",15000f));
        list.add(new Product(5,"Redmi4 ",26000f));
        list.add(new Product(6,"Lenevo Vibe",19000f));

        Stream<Product> filtered_data = list
                .stream()
                .filter(p -> {
                    return p.price >2000;
                });
        filtered_data.forEach(
                product -> System.out.println(product.name+": "+product.price)
        );
    }
}
