package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class OrderHealthyShop {
    public Order retrieve() {
        Producer producer = new Producer("HealthyShop");
        Product product = new Product("Tomatos");
        QuantityOfProduct quantityOfProduct = new QuantityOfProduct(200);
        LocalDateTime orderTime = LocalDateTime.of(2019,07,13,9,59);

        return new Order(producer, product, quantityOfProduct, orderTime);

    }
}
