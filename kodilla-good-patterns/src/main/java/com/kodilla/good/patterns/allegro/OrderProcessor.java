package com.kodilla.good.patterns.allegro;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final Order order) {
        boolean isOrdered = orderService.createOrder(order.getUser(), order.getProduct(),
                order.getOrderTime());

        if(isOrdered) {
            informationService.informUserAboutOrder(order.getUser());
            orderRepository.addOrderToRepository(order);

            return new OrderDto(order.getUser(), order.getProduct(), true);
        } else {
            return new OrderDto(order.getUser(), order.getProduct(), false);
        }
    }
}
