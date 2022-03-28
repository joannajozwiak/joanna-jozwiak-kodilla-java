package com.kodilla.stream.world;

import com.kodilla.stream.sand.Africa;
import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given
        Country country1 = new Country ("Polska", new BigDecimal("38500342"));
        Country country2 = new Country ("Niemcy", new BigDecimal("80123456"));
        Country country3 = new Country ("Czechy", new BigDecimal("8500342"));
        Country country4 = new Country ("Chiny", new BigDecimal("1500687888"));
        Country country5 = new Country ("Japonia", new BigDecimal("210111111"));
        Country country6 = new Country ("Indie", new BigDecimal("1400200100"));
        Country country7 = new Country ("Kongo", new BigDecimal("120000"));
        Country country8 = new Country ("RPA", new BigDecimal("40111000"));
        List<Country> Europa = new ArrayList<>();
        Europa.add(country1);
        Europa.add(country2);
        Europa.add(country3);
        Continent continent1 = new Continent("Europa", Europa);
        List<Country> Azja = new ArrayList<>();
        Azja.add(country4);
        Azja.add(country5);
        Azja.add(country6);
        Continent continent2= new Continent("Azja", Azja);
        List<Country> Africa = new ArrayList<>();
        Africa.add(country7);
        Africa.add(country8);
        Continent continent3 = new Continent("Africa", Africa);
        List<Continent> continentList = new ArrayList<>();
        continentList.add(continent1);
        continentList.add(continent2);
        continentList.add(continent3);
        World world = new World(continentList);


        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("3278354239");
        assertEquals(expectedPeople, totalPeople);
    }
}
