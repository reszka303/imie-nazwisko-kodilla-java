package com.kodilla.good.patterns.allegro;

public class ProductOrderService {
    public static void main(String[] args) {
        SampleOrder sampleOrder = new SampleOrder();
        Order order = sampleOrder.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationServiceImpl(),
                new OrderServiceImpl(), new OrderRepositoryImpl());

        orderProcessor.process(order);
    }
}
