package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class AddingTime {
    private LocalDateTime addingTime;

    public AddingTime(LocalDateTime addingTime) {
        this.addingTime = addingTime;
    }

    public LocalDateTime getAddingTime() {
        return addingTime;
    }
}
