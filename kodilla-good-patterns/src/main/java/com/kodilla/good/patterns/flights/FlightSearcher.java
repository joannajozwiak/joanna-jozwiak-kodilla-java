package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearcher {
    private Map<Airport, List<Airport>> flightConnections;

    public FlightSearcher(Map<Airport, List<Airport>> airports) {
        this.flightConnections = airports;
    }

    List<Flight> searchFrom (Airport airport){
        return flightConnections.get(airport).stream()
                .map(a -> new Flight(airport, a))
                .collect(Collectors.toList());
    }

    List<Flight> searchTo (Airport airport) {
        return flightConnections.entrySet().stream()
                .filter(e -> e.getValue().contains(airport))
                .map(e -> new Flight(e.getKey(), airport))
                .collect(Collectors.toList());
    }

    List<Flight> searchThrough(Airport from, Airport to){
       return flightConnections.get(from).stream()
                .filter(a -> flightConnections.get(a).contains(to))
                .map(a -> new Flight(from, to, a))
                .collect(Collectors.toList());
    }

}
