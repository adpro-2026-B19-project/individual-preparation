package com.example.individualprep;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.individualprep.service.ArithmeticUtility;
import org.junit.jupiter.api.Test;

public class ArithmeticUtilityTest {

    private final ArithmeticUtility utils = new ArithmeticUtility();

    @Test
    void testSubtractPositiveNumbers() {
        double result = utils.subtract(10.5, 4.2);
        // Using a delta of 0.0001 to account for floating point precision
        assertEquals(6.3, result, 0.0001, "10.5 - 4.2 should equal 6.3");
    }

    @Test
    void testSubtractResultingInNegative() {
        double result = utils.subtract(5.0, 10.0);
        assertEquals(-5.0, result, 0.0001);
    }

    @Test
    void testSubtractNegativeNumbers() {
        double result = utils.subtract(10.0, -5.0);
        assertEquals(15.0, result, 0.0001);
    }
}