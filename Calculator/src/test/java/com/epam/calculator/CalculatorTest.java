package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAddShouldAddWhenNumbersPositive() {
		// given
		Calculator calculator = new Calculator();
		// when
		int result = calculator.add(1, 2);
		// then
		Assert.assertEquals(3, result);
	}

	@Test
	public void testAddShouldAddWhenNumbersNegative() {
		// given
		Calculator calculator = new Calculator();
		// when
		int result = calculator.add(-15, -1);
		// then
		Assert.assertEquals(-16, result);
	}

	@Test
	public void testSubtractShouldSubtractWhenNumbersPositive() {
		// given
		Calculator calculator = new Calculator();
		// when
		int result = calculator.subtract(1, 2);
		// then
		Assert.assertEquals(-1, result);
	}

	@Test
	public void testSubtractShouldSubtractWhenNumbersNegative() {
		// given
		Calculator calculator = new Calculator();
		// when
		int result = calculator.subtract(-1, -3);
		// then
		Assert.assertEquals(2, result);
	}

	@Test
	public void testMultiplicateShouldMultiplicateWhenNumbersPositive() {
		// given
		Calculator calculator = new Calculator();
		// when
		int result = calculator.multiplicate(3, 7);
		// then
		Assert.assertEquals(21, result);
	}

	@Test
	public void testMultiplicateShouldMultiplicateWhenNumbersNegative() {
		// given
		Calculator calculator = new Calculator();
		// when
		int result = calculator.multiplicate(-5, -5);
		// then
		Assert.assertEquals(25, result);
	}

	@Test
	public void testDivideShouldDivideWhenNumbersPositive() {
		// given
		Calculator calculator = new Calculator();
		// when
		int result = calculator.divide(30, 3);
		// then
		Assert.assertEquals(10, result);
	}

	@Test
	public void testDivideShouldDivideWhenNumbersNegative() {
		// given
		Calculator calculator = new Calculator();
		// when
		int result = calculator.divide(-25, -5);
		// then
		Assert.assertEquals(5, result);
	}

}