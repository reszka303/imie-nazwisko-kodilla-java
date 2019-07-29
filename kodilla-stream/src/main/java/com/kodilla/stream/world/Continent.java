package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countries;

    public Continent(String continentName, List<Country> countries) {
        this.continentName = continentName;
        this.countries = countries;
    }

    public BigDecimal getPeopleQuantity() {
        return countries.stream().map(countries -> countries.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    public List<Country> getCountries() {
        return countries;
    }
}
