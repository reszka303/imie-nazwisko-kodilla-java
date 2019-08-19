package com.kodilla.good.patterns.allegro;

public class OrderRepositoryImpl implements OrderRepository {
    public void addOrderToRepository(Order order) {
        System.out.println("Order was saved in the system" + order.getUser() + order.getProduct());
    }
}
