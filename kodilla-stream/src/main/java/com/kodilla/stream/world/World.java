package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.sand.SandStorage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Continent> world = new ArrayList<>();

    public World(List<Continent> world) {
        this.world = world;
    }

    public List<Continent> getWorld() {
        return world;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeople = world.stream()
                .flatMap(continent -> continent.getCountryOnContinent().stream())
                .map(Country::getPepoleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeople;
    }
}
