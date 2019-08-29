package com.kodilla.good.patterns.food2Door;

public class food2DoorService {
    public static void main(String[] args) {

        //Adding new producers
        AddingExtraFoodShop addingExtraFoodShop = new AddingExtraFoodShop();
        Adding addingEFS = addingExtraFoodShop.retrieve();

        AddingProcessor addingProcessorExtraFoodShop = new AddingProcessor(new AddingProducerImpl(),
            new ProducerRepositoryImpl());

        addingProcessorExtraFoodShop.process(addingEFS);

        AddingGlutenFreeShop addingGlutenFreeShop = new AddingGlutenFreeShop();
        Adding addingGFS = addingGlutenFreeShop.retrieve();

        AddingProcessor addingProcessorGlutenFreeShop = new AddingProcessor(new AddingProducerImpl(),
                new ProducerRepositoryImpl());

        addingProcessorGlutenFreeShop.process(addingGFS);

        AddingHealthyShop addingHealthyShop = new AddingHealthyShop();
        Adding addingHS = addingHealthyShop.retrieve();

        AddingProcessor addingProcessorHealthyShop  = new AddingProcessor(new AddingProducerImpl(),
                new ProducerRepositoryImpl());

        addingProcessorHealthyShop.process(addingHS);
        System.out.println();

        //The orders of added producers
        OrderExtraFoodShop orderExtraFoodShop = new OrderExtraFoodShop();
        Order orderEFS = orderExtraFoodShop.retrieve();

        OrderProcessor orderProcessorExtraFoodShop = new OrderProcessor(new OrderInformationServiceImpl(),
                new OrderServiceImpl(), new OrderRepositoryImpl());
        orderProcessorExtraFoodShop.process(orderEFS);
        System.out.println();

        OrderGlutenFreeShop orderGlutenFreeShop = new OrderGlutenFreeShop();
        Order orderGFS = orderGlutenFreeShop.retrieve();

        OrderProcessor orderProcessorGlutenFreeShop = new OrderProcessor(new OrderInformationServiceImpl(),
                new OrderServiceImpl(), new OrderRepositoryImpl());

        orderProcessorGlutenFreeShop.process(orderGFS);
        System.out.println();

        OrderHealthyShop orderHealthyShop = new OrderHealthyShop();
        Order orderHS = orderHealthyShop.retrieve();

        OrderProcessor orderProcessorHealthyShop = new OrderProcessor(new OrderInformationServiceImpl(),
                new OrderServiceImpl(), new OrderRepositoryImpl());

        orderProcessorHealthyShop.process(orderHS);
    }
}
