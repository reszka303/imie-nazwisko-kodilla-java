package com.kodilla.good.patterns.food2Door;

public class AddingProducerDto {
    private Producer producer;
    private boolean isAdded;

    public AddingProducerDto(Producer producer, boolean isAdded) {
        this.producer = producer;
        this.isAdded = isAdded;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isAdded() {
        return isAdded;
    }
}
