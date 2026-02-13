package com.example.individualprep;

import com.example.individualprep.service.ArithmeticUtility;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArithmeticUtilityTest {

    @Autowired
    private ArithmeticUtility arithmeticUtility;
  
    @Test
    void testExponent() {
        double result = arithmeticUtility.exponent(2.0, 3);
        assertEquals(8.0, result);
    }

    @Test
    void testSubtractPositiveNumbers() {
        double result = arithmeticUtility.subtract(10.5, 4.2);
        assertEquals(6.3, result, 0.0001, "10.5 - 4.2 should equal 6.3");
    }

    @Test
    void testSubtractResultingInNegative() {
        double result = arithmeticUtility.subtract(5.0, 10.0);
        assertEquals(-5.0, result, 0.0001);
    }

    @Test
    void testSubtractNegativeNumbers() {
        double result = arithmeticUtility.subtract(10.0, -5.0);
        assertEquals(15.0, result, 0.0001);
    }
}