package com.example.individualprep;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import com.example.individualprep.service.ArithmeticUtility;

@SpringBootTest
class IndividualprepApplicationTests {

	@Autowired
	private ArithmeticUtility arithmeticUtility;

	@Test
	void testExponent() {
		double result = arithmeticUtility.exponent(2.0, 3);
		assertEquals(8.0, result);
	}

}
