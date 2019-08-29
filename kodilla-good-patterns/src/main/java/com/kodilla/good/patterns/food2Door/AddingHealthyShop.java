package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class AddingHealthyShop {
    public Adding retrieve() {
        Producer producer = new Producer("HealthyShop");
        AddingTime addingTime = new AddingTime(LocalDateTime.of(2019, 6, 15, 13, 14));

        return new Adding(producer, addingTime);
    }
}
