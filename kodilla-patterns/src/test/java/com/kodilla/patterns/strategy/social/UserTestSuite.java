package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
    //Given
    User tom = new Millenials("Tom");
    User david = new YGeneration("David");
    User anna = new ZGeneration("Anna");

    //When
    String tomShare = tom.SharePost();
        System.out.println("Tom" + tomShare);
    String davidShare = david.SharePost();
        System.out.println("David " + davidShare);
    String annaShare = anna.SharePost();
        System.out.println("Anna " + annaShare);

    //Then
    assertEquals("Twitter",tomShare);
    assertEquals("Facebook", davidShare);
    assertEquals("Snapchat", annaShare);
}
    @Test
    void testIndividualInvestingStrategy() {
        //Given
        User tom = new Millenials("Tom");

        //When
        String tomShare = tom.SharePost();
        System.out.println("Steven post on: " + tomShare);
        tom.setSharingPost(new FacebookPublisher());
        tomShare = tom.SharePost();
        System.out.println("Steven now " + tomShare);

        //Then
        assertEquals("Facebook", tomShare);
    }

}

