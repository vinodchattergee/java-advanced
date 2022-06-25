package com.java.advanced.collectionsarraylist;

import java.util.ArrayList;

public class WorkshopApp {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("spinner", 3.99, "fun"));
        products.add(new Product("bud", 39.9, "extremely clear"));
        products.add(new Product("bud", 39.9, "extremely clear"));
//inserts the element in an index and pushes the elements to the next index
        products.add(1, new Product("new product", 36.00, "very new product"));
        products.add(1, new Product("new product1", 36.00, "very new product"));
        products.remove(2);
        products.remove(new Product("bud", 39.9, "extremely clear"));
        //System.out.println(products);
        for (Product product : products) {
            System.out.println(product);
        }
//Set will replace an index with new value
        products.set(0, new Product("robo", 5.99, "We cannot use it outside"));

        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("The third element in the arraylist is ");
        System.out.println(products.get(2));
        System.out.println("The size of the arraylist is");
        System.out.println(products.size());

    }
}
