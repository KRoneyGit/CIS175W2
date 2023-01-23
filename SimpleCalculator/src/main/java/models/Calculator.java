package models;

/**
* @author Kevin Roney - karoney
* CIS 175 - Fall 2023
* Jan 23, 2023
*/
public class Calculator {

	
	public Calculator() {
		
	}
	
	public double add(double input1, double input2) {
		return input1 + input2;
	}
	
	public double subtract(double input1, double input2) {
		return input1 - input2;
	}
	
	public double multiply(double input1, double input2) {
		return input1 * input2;
	}
	
	public double divide(double input1, double input2) {
		return input1 / input2;
	}
	
	public double power(double input, double exponent) {
		double value = input;
		for (int i = 1; i < exponent; i++) {
			value = value * input;
		}
		return value;
	}
	
	public double absolute(double input) {
		if (input < 0) {
			input = input * -1;
		}
		return input;
	}
}
