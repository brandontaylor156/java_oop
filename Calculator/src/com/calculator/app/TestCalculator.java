package com.calculator.app;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		myCalculator.setOperandOne(4.5);
		myCalculator.setOperandTwo(3.8);
		myCalculator.setOperation('*');
		System.out.println(myCalculator.getResults());
	}

}
