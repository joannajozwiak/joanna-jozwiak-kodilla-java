package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {
    @Test
    void testProbablyIWillThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertAll(
                () -> assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(2,1.3)),
                () -> assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(2,1.5)),
                () -> assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(1,1.5))
        );



    }
}
