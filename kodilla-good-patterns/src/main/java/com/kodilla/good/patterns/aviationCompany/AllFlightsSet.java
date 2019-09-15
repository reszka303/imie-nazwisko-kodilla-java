package com.kodilla.good.patterns.aviationCompany;

import java.util.HashSet;
import java.util.Set;

public class AllFlightsSet {
    private final Set<Flight> allFlightsSet;

    public AllFlightsSet() {
        allFlightsSet = new HashSet<>();
        allFlightsSet.add(new Flight("Warszawa", "Wrocław"));
        allFlightsSet.add(new Flight("Gdańsk", "Warszawa"));
        allFlightsSet.add(new Flight("Warszawa", "Kraków"));
        allFlightsSet.add(new Flight("Kraków", "Wrocław"));
        allFlightsSet.add(new Flight("Gdańsk", "Katowice"));
        allFlightsSet.add(new Flight("Katowice", "Gdańsk"));
    }

    public Set<Flight> getAllFlightsSet() {
        return allFlightsSet;
    }
}
