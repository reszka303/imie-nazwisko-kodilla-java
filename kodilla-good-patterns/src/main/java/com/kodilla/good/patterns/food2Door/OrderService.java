package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public interface OrderService {
    public boolean createOrder(Producer producer, Product product, QuantityOfProduct quantityOfProduct, LocalDateTime timeOrder);
}
