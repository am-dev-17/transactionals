package com.amarmodi.jpa.hibernate.transactional.model.inheritencee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void mainghfd(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> floatList = productsList
                .stream()
                .filter(p -> p.price > 3000)
                .map(p -> p.price)
                .collect(Collectors.toList());
        System.out.println(floatList);
    }

    public static void mainReducer(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        Float total = productsList
                .stream()
                .map(product -> {
                    return product.price;
                })
                .reduce(0.0f, (sum, price)-> {
                    return sum + price;
                });

        System.out.println(total);
    }

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        // Using Collectors's method to sum the prices.
        double totalPrice3 = productsList
                .stream()
                .collect(Collectors.summingDouble(product -> product.price));
        System.out.println(totalPrice3);
    }
}  