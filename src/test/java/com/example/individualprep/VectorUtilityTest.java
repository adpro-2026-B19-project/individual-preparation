package com.example.individualprep;

import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VectorUtilityTest {

    @Autowired
    private VectorUtility vectorUtility;

    @Test
    void testAddVectorSuccess() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        double[] expected = {5.0, 7.0, 9.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result);
    }

    @Test
    void testAddVectorDifferentSize() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};

        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.add(v1, v2);
        });
    }

    @Test
    void testDotProductStandard() {
        double[] v1 = {1.0, 3.0, -5.0};
        double[] v2 = {4.0, -2.0, -1.0};
        assertEquals(3.0, vectorUtility.dotProduct(v1, v2), 1e-9);
    }

    @Test
    void testOrthogonalVectors() {
        double[] v1 = {1.0, 0.0};
        double[] v2 = {0.0, 1.0};
        assertEquals(0.0, vectorUtility.dotProduct(v1, v2), 1e-9);
    }

    @Test
    void testMismatchedLengths() {
        double[] v1 = {1.2, 3.4};
        double[] v2 = {1.2};
        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.dotProduct(v1, v2);
        });
    }

    @Test
    void testVectorSubtractStandard() {
        double[] v1 = {5.0, 10.0, 15.0};
        double[] v2 = {2.0, 3.0, 5.0};
        double[] expected = {3.0, 7.0, 10.0};

        assertArrayEquals(expected, vectorUtility.subtract(v1, v2), 1e-9);
    }

    @Test
    void testVectorSubtractMismatchedLengths() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {1.0, 2.0};

        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.subtract(v1, v2);
        }, "Harus melempar exception jika dimensi vector berbeda");
    }
}
