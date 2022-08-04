package com.calculator.app;

public class Calculator implements java.io.Serializable {
	private double operand1;
	private double operand2;
	private char operation;
	
	public Calculator() {
		operand1 = 0;
		operand2 = 0;
		operation = '!';
	}
	
	public void setOperandOne(double operand1) {
		this.operand1 = operand1;
	}
	
	public double getOperandOne() {
		return operand1;
	}
	
	
	public void setOperandTwo(double operand2) {
		this.operand2 = operand2;
	}
	
	public double getOperandTwo() {
		return operand2;
	}
	
	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	public char getOperation() {
		return operation;
	}
	
	public double getResults() {
		switch (getOperation()) {
		case '+':
			return getOperandOne() + getOperandTwo();
		case '-':
			return getOperandOne() - getOperandTwo();
		case '*':
			return getOperandOne() * getOperandTwo();
		case '/':
			return getOperandOne() / getOperandTwo();
		default:
			System.out.println("Must be addition, subtraction, multiplication, or division");
			return 0.0;
		}
		
	}
	
}
