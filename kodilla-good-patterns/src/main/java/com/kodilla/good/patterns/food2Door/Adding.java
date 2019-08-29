package com.kodilla.good.patterns.food2Door;


public class Adding {
    private Producer producer;
    private AddingTime addingTime;

    public Adding(Producer producer, AddingTime addingTime) {
        this.producer = producer;
        this.addingTime = addingTime;
    }

    public Producer getProducer() {
        return producer;
    }

    public AddingTime getAddingTime() {
        return addingTime;
    }
}
