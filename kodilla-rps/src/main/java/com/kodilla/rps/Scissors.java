package com.kodilla.rps;

public class Scissors implements Thing {
    public String getThingName() {
        return "You chose 3 - Scissors";
    }

    @Override
    public String toString() {
        return getThingName();
    }
}
