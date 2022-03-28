package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    String country;
    BigDecimal PepoleQuantity;

    public Country(String country, BigDecimal pepoleQuantity) {
        this.country = country;
        PepoleQuantity = pepoleQuantity;
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal getPepoleQuantity() {
        return PepoleQuantity;
    }
}
