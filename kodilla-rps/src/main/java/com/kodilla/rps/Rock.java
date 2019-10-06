package com.kodilla.rps;

public class Rock implements Thing {
    public String getThingName() {
        return "You chose 1 - The rock";
    }

    @Override
    public String toString() {
        return getThingName();
    }
}
