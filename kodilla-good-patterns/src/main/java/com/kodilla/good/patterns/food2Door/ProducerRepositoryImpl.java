package com.kodilla.good.patterns.food2Door;

public class ProducerRepositoryImpl implements ProducerRepository {
    public void addProducerToRepository(Producer producer, AddingTime addingTime) {
        System.out.println("The new producer has been added to the database: " + producer.getName() +" Date: " + addingTime.getAddingTime());
    }
}
