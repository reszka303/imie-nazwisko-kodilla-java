package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class OrderExtraFoodShop {
    public Order retrieve() {
        Producer producer = new Producer("ExtraFoodShop");
        Product product = new Product("Fishes");
        QuantityOfProduct quantityOfProduct = new QuantityOfProduct(300);
        LocalDateTime orderTime = LocalDateTime.of(2019,8,21,15,34);
        return new Order(producer, product, quantityOfProduct,  orderTime);
    }

}
