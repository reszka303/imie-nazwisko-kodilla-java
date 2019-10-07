package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Bakery", " Rolls", 8.0);
            case PAINTINGTASK:
                return new PaintingTask("Room","Blue", "Wall");
            case DRIVINGTASK:
                return new DrivingTask("Trip", "Warsaw", "By car");
            default:
                return null;
        }
    }
}
