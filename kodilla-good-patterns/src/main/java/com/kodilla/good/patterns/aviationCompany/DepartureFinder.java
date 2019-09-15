package com.kodilla.good.patterns.aviationCompany;

import java.util.Set;
import java.util.stream.Collectors;

public class DepartureFinder implements FlightFinder {
    private String departure;

    public DepartureFinder(String departure) {
        this.departure = departure;
    }

    public void findFlight() {
        Set<Flight> flightsWithDeparture = (new AllFlightsSet().getAllFlightsSet().stream())
                .filter(f -> f.getDeparture().equals(departure))
                .collect(Collectors.toSet());

        if(flightsWithDeparture.size() == 0) {
            System.out.println("No flights from departure" + departure);
        } else {
            System.out.println("Please find our flights from departure " + departure);
            flightsWithDeparture.stream()
                    .map(f -> "Departure: " + f.getDeparture() + " destination: " + f.getDestination())
                    .forEach(System.out::println);
        }
    }
}
