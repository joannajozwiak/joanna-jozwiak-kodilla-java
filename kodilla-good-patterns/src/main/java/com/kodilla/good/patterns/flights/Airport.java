package com.kodilla.good.patterns.flights;

import java.util.List;

public class Airport {
    private String city;

    public Airport(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;

        Airport airport = (Airport) o;

        return city != null ? city.equals(airport.city) : airport.city == null;
    }

    @Override
    public int hashCode() {
        return city != null ? city.hashCode() : 0;
    }

    @Override
    public String toString() {
        return city;
    }
}
