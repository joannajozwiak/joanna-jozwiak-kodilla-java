package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    String continent;
    List<Country> countryOnContinent = new ArrayList<>();

    public  Continent(String continent,List<Country> countryOnContinent) {
        this.countryOnContinent = countryOnContinent;
    }

    public List<Country> getCountryOnContinent() {
        return countryOnContinent;
    }
}
