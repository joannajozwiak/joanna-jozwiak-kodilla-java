package com.kodilla.spring.calculator;

import com.kodilla.spring.library.Library;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

        @Autowired
        private Calculator calculator;

        @Test
        public void testCalculations() {
            //Given
            //When
            double sum= calculator.add(6,2);
            double sub= calculator.sub(6,2);
            double mul= calculator.mul(6,2);
            double div= calculator.div(6,2);
            //Then
            assertEquals(8, sum);
            assertEquals(4, sub);
            assertEquals(12, mul);
            assertEquals(3, div);
        }
    }

