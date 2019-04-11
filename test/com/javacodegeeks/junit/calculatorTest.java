package com.javacodegeeks.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class calculatorTest {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		calculator calculator = new calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		calculator calculator = new calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
	
	@Test
	@DisplayName("1 / 1 = 1")
	void dividesTwoNumbers() {
		calculator calculator = new calculator();
		assertEquals(1, calculator.divide(1, 1, "1 / 1 should equal 1");
	}

	@ParameterizedTest(name = "{0} / {1} = {2}")
	@CsvSource({
			"0,    1,   0",
			"1,    2,   0.5",
			"10,  5, 2",
			"100,  10, 10"
	})
	void divide(double first, double second, double expectedResult) {
		calculator calculator = new calculator();
		assertEquals(expectedResult, calculator.divide(first, second),
				() -> first + " / " + second + " should equal " + expectedResult);
	}

}
