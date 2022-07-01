package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    @Test
    void testLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;
        //When
        logger.log("Zalogowany");
        logger.log("Zalogowany2");
        //Then
        assertEquals("Zalogowany2",logger.getLastLog());
    }
}
