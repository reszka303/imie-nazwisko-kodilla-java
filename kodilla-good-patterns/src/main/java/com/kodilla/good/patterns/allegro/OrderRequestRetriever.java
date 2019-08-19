package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("John", "Maverick");

        LocalDateTime orderTime = LocalDateTime.of(2019,8,17,12,34);

        return new OrderRequest(user, orderTime);
    }
}
