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
public class TestSimpleOperations {
	Calculator calc = new Calculator();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		double expected = 4;
		double actual = calc.add(1,3);
		
		assertEquals(expected,actual, 0.0);
	}

	@Test
	public void testSubtract() {
		double expected = 3;
		double actual = calc.subtract(4,1);
		
		assertTrue(expected == actual);
	}

	@Test
	public void testMultiply() {
		double expected = 12;
		double actual = calc.multiply(3,4);
		
		assertFalse(expected != actual);
	}
	
	@Test
	public void testDivide() {
		double expected = 5;
		double actual = calc.divide(15,3);
		
		assertEquals(expected, actual, 0.0);
	}
}
