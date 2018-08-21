package com.motoserra.Calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator c;
	
	@Before
	public void inicializa() {
		c = new Calculator();
	}

	@Test
	public void calculatorVariasSomasTest() {
		int resp = c.evaluate("5+3+2");
		assertEquals(10,resp);
	}
	
	@Test
	public void calculatorSoUmNroTest() {
		int resp = c.evaluate("5");
		assertEquals(5,resp);
	}

}
