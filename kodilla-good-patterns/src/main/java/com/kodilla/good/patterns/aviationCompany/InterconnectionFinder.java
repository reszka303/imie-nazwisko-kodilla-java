package com.kodilla.good.patterns.aviationCompany;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class InterconnectionFinder implements FlightFinder {
    private AllFlightsSet allFlightsSet;

    public InterconnectionFinder() {
        this.allFlightsSet = new AllFlightsSet();
    }

    @Override
    public void findFlight() {
        Set<InterconnectionFlight> flightsWithInterconnection = new HashSet<>();
        for (Flight flight:
                allFlightsSet.getAllFlightsSet()) {
            Set<InterconnectionFlight> temporarySet = allFlightsSet.getAllFlightsSet().stream()
                    .filter(f -> f.getDeparture().equals(flight.getDestination()) && !(f.getDestination().equals(flight.getDeparture())))
                    .map(f -> new InterconnectionFlight(flight.getDeparture(), f.getDeparture(), f.getDestination()))
                    .collect(Collectors.toSet());

            flightsWithInterconnection.addAll(temporarySet);
        }

        if (flightsWithInterconnection.size() == 0) {
            System.out.println("No flights with interconnection");
        } else {
            System.out.println("Please find our flights with interconnection: ");
            flightsWithInterconnection.stream()
                    .map(f -> "Departure: " + f.getDeparture() +
                            " -> interconnection: " + f.getInterconnection() +
                            " -> destination: " + f.getDestination())
                    .forEach(System.out::println);
        }
    }
}