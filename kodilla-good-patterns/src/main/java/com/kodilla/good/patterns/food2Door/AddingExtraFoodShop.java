package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class AddingExtraFoodShop {
    public Adding retrieve() {
        Producer producer = new Producer("ExtraFoodShop");
        AddingTime addingTime = new AddingTime(LocalDateTime.of(2019,5,14,11,4));

        return new Adding(producer, addingTime);
    }
}
