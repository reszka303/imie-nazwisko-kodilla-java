package com.kodilla.good.patterns.food2Door;

public class AddingProcessor {
    private AddingProducer addingProducer;
    private ProducerRepository producerRepository;

    public AddingProcessor(AddingProducer addingProducer, ProducerRepository producerRepository) {
        this.addingProducer = addingProducer;
        this.producerRepository = producerRepository;
    }

    public AddingProducerDto process(Adding adding) {
        boolean isAdded = addingProducer.addingProducer(adding.getProducer());

        if (isAdded) {
            producerRepository.addProducerToRepository(adding.getProducer(), adding.getAddingTime());

            return new AddingProducerDto(adding.getProducer(), true);
        } else {
            return new AddingProducerDto(adding.getProducer(), false);
        }

    }
}
