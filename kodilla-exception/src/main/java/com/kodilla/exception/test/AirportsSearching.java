package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class AirportsSearching {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        List<String> connections = new ArrayList<>();

        connections.add("London");
        connections.add("Warsaw");
        connections.add("Krakow");
        connections.add("Wroclaw");

        if (!connections.contains(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("There is no arrival");
        }

        if (!connections.contains(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("There is no departure");
        }
   }

    public static void main(String[] args) {
        AirportsSearching airportsSearching = new AirportsSearching();

        try {
            airportsSearching.findFlight(new Flight(null, null));
        } catch (RouteNotFoundException e) {
            System.out.println("Problem with the connection" + e.getMessage());
        } finally {
            System.out.println("System off");
        }
    }
}

