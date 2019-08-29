package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class Order {

    private Producer producer;
    private Product product;
    private QuantityOfProduct quantityOfProduct;
    private LocalDateTime orderTime;

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public QuantityOfProduct getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public Order(Producer producer, Product product, QuantityOfProduct quantityOfProduct, LocalDateTime orderTime) {
        this.producer = producer;
        this.product = product;
        this.quantityOfProduct = quantityOfProduct;
        this.orderTime = orderTime;


    }
}

