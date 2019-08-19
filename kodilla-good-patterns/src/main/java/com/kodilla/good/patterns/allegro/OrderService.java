package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public interface OrderService {
    boolean createOrder(User user, Product product, LocalDateTime orderTime);
}
