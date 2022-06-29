package com.kodilla.good.patterns.food2door;

public class Product {
    private String productName;
    private double price;
    private double amount;

    public Product(String productName, double price, double amount) {
        this.productName = productName;
        this.price = price;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }
}
