package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import models.Calculator;

/**
* @author Kevin Roney - karoney
* CIS 175 - Fall 2023
* Jan 23, 2023
*/
public class TestHigherOperations {
	Calculator calc = new Calculator();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPower() {
		double expected = 169;
		double actual = calc.power(13,2);
		
		assertEquals(expected, actual, 0.0);
	}
	
	@Test
	public void testAbsoluteValue() {
		double expected = 4;
		double actual = calc.absolute(-4);

		assertEquals(expected, actual, 0.0);
	}
}
