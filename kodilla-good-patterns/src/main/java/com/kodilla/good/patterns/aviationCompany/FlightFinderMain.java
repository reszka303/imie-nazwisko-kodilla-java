package com.kodilla.good.patterns.aviationCompany;

public class FlightFinderMain {
    public static void main(String[] args) {

        (new AllFlightsSet()).getAllFlightsSet().stream()
                .map(f -> "Departure: " + f.getDeparture() + " -> destination: " + f.getDestination())
                .forEach(System.out::println);
        System.out.println();

//        FlightFinderExecutor flightFinderExecutor1 = new FlightFinderExecutor(new InterconnectionFinder());
//        flightFinderExecutor1.execute();
//        System.out.println();

        FlightFinderExecutor flightFinderExecutor2 = new FlightFinderExecutor(new DepartureFinder("Warszawa"));
        flightFinderExecutor2.execute();
        System.out.println();

//        FlightFinderExecutor flightFinderExecutor3 = new FlightFinderExecutor(new DestinationFinder("Warszawa"));
//        flightFinderExecutor3.execute();
    }
}
