package oop10;

public class Category {
    private String name;
    private Product[] products = new Product[5];



    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }
}
