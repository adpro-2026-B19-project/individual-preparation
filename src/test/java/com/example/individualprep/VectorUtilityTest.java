package com.example.individualprep;

import static org.junit.jupiter.api.Assertions.*;

import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.Test;

public class VectorUtilityTest {

    private final VectorUtility util = new VectorUtility();

    @Test
    void testDotProductStandard() {
        double[] v1 = {1.0, 3.0, -5.0};
        double[] v2 = {4.0, -2.0, -1.0};
        assertEquals(3.0, util.dotProduct(v1, v2), 1e-9);
    }

    @Test
    void testOrthogonalVectors() {
        double[] v1 = {1.0, 0.0};
        double[] v2 = {0.0, 1.0};
        assertEquals(0.0, util.dotProduct(v1, v2), 1e-9);
    }

    @Test
    void testMismatchedLengths() {
        double[] v1 = {1.2, 3.4};
        double[] v2 = {1.2};
        assertThrows(IllegalArgumentException.class, () -> {
            util.dotProduct(v1, v2);
        });
    }
}