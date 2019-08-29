package com.kodilla.good.patterns.food2Door;

public class OrderDto {
    private Producer producer;
    private Product product;
    private boolean isOrdered;

    public OrderDto(Producer producer, Product product, boolean isOrdered) {
        this.producer = producer;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public boolean getIsOrdered() {
        return isOrdered;
    }
}
