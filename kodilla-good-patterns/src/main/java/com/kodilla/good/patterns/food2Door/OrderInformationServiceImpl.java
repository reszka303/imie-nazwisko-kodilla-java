package com.kodilla.good.patterns.food2Door;

public class OrderInformationServiceImpl implements OrderInformationService {
    public void informProducerAboutOrder(Producer producer) {
        System.out.println("SMS has been sent to " + producer.getName());
    }
}
