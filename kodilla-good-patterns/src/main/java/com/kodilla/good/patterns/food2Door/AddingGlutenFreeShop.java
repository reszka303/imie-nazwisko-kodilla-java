package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class AddingGlutenFreeShop {
    public Adding retrieve() {
        Producer producer = new Producer("GlutenFreeShop");
        AddingTime addingTime = new AddingTime(LocalDateTime.of(2019,5,27,14,30));

        return new Adding(producer, addingTime);
    }
}
