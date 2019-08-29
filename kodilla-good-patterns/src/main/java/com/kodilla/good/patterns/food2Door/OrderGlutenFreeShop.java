package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class OrderGlutenFreeShop {
    public Order retrieve() {
        Producer producer = new Producer("GlutenFreeShop");
        Product product = new Product("Breakfast cereals");
        QuantityOfProduct quantityOfProduct = new QuantityOfProduct(210);
        LocalDateTime orderTime = LocalDateTime.of(2019, 8, 10, 8, 17);

        return new Order(producer, product, quantityOfProduct, orderTime);
    }
}
