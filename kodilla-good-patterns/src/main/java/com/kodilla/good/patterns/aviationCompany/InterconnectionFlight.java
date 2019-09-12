package com.kodilla.good.patterns.aviationCompany;

import java.util.Objects;

public class InterconnectionFlight {
    private final String departure;
    private final String interconnection;
    private final String destination;

    public InterconnectionFlight(String departure, String interconnection, String destination) {
        this.departure = departure;
        this.interconnection = interconnection;
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getInterconnection() {
        return interconnection;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterconnectionFlight that = (InterconnectionFlight) o;
        return Objects.equals(departure, that.departure) &&
                Objects.equals(interconnection, that.interconnection) &&
                Objects.equals(destination, that.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, interconnection, destination);
    }
}
