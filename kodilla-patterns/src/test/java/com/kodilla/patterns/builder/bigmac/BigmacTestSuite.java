package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigMacNew() {
        //Given
       BigMac bigMac = new BigMac.BigMacBuilder()
                .ingredient("Onion")
                .bun("Sesam")
                .sauce("Spicy")
                .burgers(2)
                .ingredient("Cucumber")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        assertEquals(2, howManyIngredients);
    }
}


