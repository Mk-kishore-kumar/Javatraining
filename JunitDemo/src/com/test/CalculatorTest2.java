package com.test;
//parameterized testcase
import static org.junit.Assert.*;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.day13.Calculator;


@RunWith(Parameterized.class)
public class CalculatorTest2 {
	static Calculator calc;
	
	private int input1;
	private int input2;
	private int excepted1;
	private int excepted2;
	
	public CalculatorTest2(int input1, int input2, int excepted1,int excepted2) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.excepted1 = excepted1;
		this.excepted2 = excepted2;
	}
	

@BeforeClass
 public static void	beforeClass() {
		
		calc = new Calculator();
		
	}


@AfterClass
public static void	afterClass() {
		
		calc = null;
		
	}
	
	
	


	@Test
	public void testAddition() {
		int actual = calc.addition(input1, input2);
		assertEquals(excepted1, actual);
	}

	@Test
	public void testSubtraction() {
		int actual = calc.subtraction(input1, input2);
		assertEquals(excepted2, actual);
	}
   @Parameters
	public static Collection calculatorNumber() {
		
		return Arrays.asList(new Object[][] {
			{2, 3, 5, -1},
			{4, 3, 7, 1},
			{19, 2, 21, 17},
			{22, 8, 30, 14},
			{23, 7, 30, 16},
		
		});
	}

}
