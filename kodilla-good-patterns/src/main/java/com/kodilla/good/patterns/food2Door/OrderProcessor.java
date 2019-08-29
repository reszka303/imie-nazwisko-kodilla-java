package com.kodilla.good.patterns.food2Door;

public class OrderProcessor {
    private OrderInformationService orderInformationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(OrderInformationService orderInformationService, OrderService orderService, OrderRepository orderRepository) {
        this.orderInformationService = orderInformationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    OrderDto process(Order order) {
        boolean isOrdered = orderService.createOrder(order.getProducer(), order.getProduct(), order.getQuantityOfProduct(), order.getOrderTime());

        if (isOrdered) {
            orderInformationService.informProducerAboutOrder(order.getProducer());
            orderRepository.addOrderToRepository(order);

            return new OrderDto(order.getProducer(), order.getProduct(), true);
        } else {
            return new OrderDto(order.getProducer(), order.getProduct(), false);
        }

    }
}
