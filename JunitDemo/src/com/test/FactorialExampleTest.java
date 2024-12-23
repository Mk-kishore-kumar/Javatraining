package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.day13.FactorialExample;

public class FactorialExampleTest {

	
	@Test
	public void testGetFactorial() {
		FactorialExample fact = new FactorialExample();
		int actual = fact.getFactorial(5);
		int excepted = 120;
		assertEquals(excepted, actual);
		
	}

}
