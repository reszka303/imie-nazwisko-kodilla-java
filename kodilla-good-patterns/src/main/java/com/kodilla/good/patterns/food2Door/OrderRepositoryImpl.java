package com.kodilla.good.patterns.food2Door;

public class OrderRepositoryImpl implements OrderRepository {
    public void addOrderToRepository(Order order) {
        System.out.println("Order has been saved in the system: "  + order.getProduct() +" " + order.getQuantityOfProduct() + "Date: " + order.getOrderTime());
    }
}
