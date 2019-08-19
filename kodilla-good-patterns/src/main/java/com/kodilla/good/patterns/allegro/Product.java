package com.kodilla.good.patterns.allegro;

public class Product {
    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "\n" + "Product{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
