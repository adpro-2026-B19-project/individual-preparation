package com.example.individualprep;

import com.example.individualprep.service.VectorUtility;
import com.example.individualprep.service.ArithmeticUtility;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class IndividualprepApplicationTests {

	@Autowired
	private VectorUtility vectorUtility;
	@Autowired
	private ArithmeticUtility arithmeticUtility;

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
	void testExponent() {
		double result = arithmeticUtility.exponent(2.0, 3);
		assertEquals(8.0, result);
	}


}
