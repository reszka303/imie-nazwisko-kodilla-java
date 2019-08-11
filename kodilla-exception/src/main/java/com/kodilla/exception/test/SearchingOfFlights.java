package com.kodilla.exception.test;

import java.util.HashMap;

public final class SearchingOfFlights {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> connections = new HashMap<>();

        connections.put("Airport of Sydney", true);
        connections.put("Airport of New York", false);
        connections.put("Airport of Warsaw", true);
        connections.put("Airport of London", false);
        connections.put("Airport of Tokyo", true);
        connections.put("Airport of Luxembourg", false);

        if(!connections.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("There is no Arrival");
        }

        if(!connections.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("There is no Departure");
        }
    }

    public static void main(String[] args) {
        SearchingOfFlights searchingOfFlights = new SearchingOfFlights();

        try {
            searchingOfFlights.findFlight(new Flight("Airport of Sydney", "Airport of New York"));
        } catch (RouteNotFoundException e) {
            System.out.println("Problem with the route: " + e.getMessage());
        } finally {
            System.out.println("Logging flight searches");
        }
    }
}





