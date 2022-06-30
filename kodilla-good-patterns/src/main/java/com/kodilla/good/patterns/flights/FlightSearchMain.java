package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightSearchMain {

    public static void main(String[] args){

        Airport airport1 = new Airport("Poznań");
        Airport airport2 = new Airport("Warszawa");
        Airport airport3 = new Airport("Gdańsk");
        Airport airport4 = new Airport("Berlin");
        Airport airport5 = new Airport("Rzeszów");
        Airport airport6 = new Airport("Kraków");
        Airport airport7 = new Airport("Szczecin");
        Airport airport8 = new Airport("Wrocław");
        Airport airport9 = new Airport("Łódź");
        Airport airport10 = new Airport("Londyn");

        Map<Airport, List<Airport>> connections = getAirportListMap(airport1, airport2, airport3, airport4, airport5, airport6, airport7, airport8, airport9, airport10);

        FlightSearcher flightSearcher = new FlightSearcher(connections);

        List<Flight> flights = flightSearcher.searchFrom(airport1);
        System.out.println(flights);

        List<Flight> flights1 = flightSearcher.searchTo(airport6);
        System.out.println(flights1);

        List<Flight> flights2 = flightSearcher.searchThrough(airport1, airport7);
        System.out.println(flights2);

        List<Flight> flights3 = flightSearcher.searchThrough(airport1, airport10);
        System.out.println(flights3);

    }

    private static Map<Airport, List<Airport>> getAirportListMap(Airport airport1, Airport airport2, Airport airport3, Airport airport4, Airport airport5, Airport airport6, Airport airport7, Airport airport8, Airport airport9, Airport airport10) {
        Map<Airport, List<Airport>> connections = new HashMap<>();
        connections.put(airport1, List.of(airport2, airport3, airport5, airport6));
        connections.put(airport2, List.of(airport3, airport4));
        connections.put(airport3, List.of(airport4, airport5, airport6));
        connections.put(airport4, List.of(airport5, airport6));
        connections.put(airport5, List.of(airport6, airport7));
        connections.put(airport6, List.of(airport7, airport8));
        connections.put(airport7, List.of(airport8, airport9));
        connections.put(airport8, List.of(airport9, airport10));
        connections.put(airport9, List.of(airport10, airport1));
        connections.put(airport10, List.of(airport1, airport2));
        return connections;
    }
}
