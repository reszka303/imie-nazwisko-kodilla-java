package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class SampleOrder {
    public Order retrieve() {
        User user1 = new User("John", "Maverick");
        Product product1 = new Product("Vacuum cleaner");
        LocalDateTime orderTime1 = LocalDateTime.of(2019,8,18,17,8);

        return new Order(user1, product1, orderTime1);
    }
}
