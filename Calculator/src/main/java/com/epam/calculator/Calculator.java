package com.epam.calculator;

public class Calculator {
	
	public int add(int first, int second) {
		return first + second;
	}

	public int subtract(int first, int second) {
		return first - second;
	}

	public int multiplicate(int first, int second) {
		return first * second;
	}

	public int divide(int first, int second) {
		if (second == 0) {
			throw new ArithmeticException("Division by zero!");
		}
		return first / second;
	}
	
}
