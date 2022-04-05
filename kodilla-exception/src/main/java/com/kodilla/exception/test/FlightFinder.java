package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
     public static void main(String[] args) throws RouteNotFoundException {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Chopin Airport", "Ławica airport");
        try {
         boolean result = flightFinder.findFlight(flight);
        } catch (Exception e) {
            System.out.println("Lotnisko nie gotowe");
        } finally {
            System.out.println("Lotniska sprawdzone");
        }
     }


         public boolean findFlight (Flight flight) throws RouteNotFoundException {
            Map<String, Boolean> airports = new HashMap<>();
            if (!airports.containsKey(flight.arrivalAirport)) {
                throw new RouteNotFoundException();
            } else {
                System.out.println("Airport " + flight.arrivalAirport + " is ready");
            }
            return airports.get(flight.arrivalAirport);
        }

}

