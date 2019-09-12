package com.kodilla.good.patterns.aviationCompany;

public class FlightFinderExecutor {
    FlightFinder flightFinder;

    public FlightFinderExecutor(FlightFinder flightFinder) {
        this.flightFinder = flightFinder;
    }

    public void execute() {
        flightFinder.findFlight();
    }
}
