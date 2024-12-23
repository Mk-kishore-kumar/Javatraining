package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.day13.Calculator;

public class CalculatorTest {
	
	int input1;
	int input2;
	static Calculator calc;

@BeforeClass
 public static void	beforeClass() {
		System.out.println("before class");
		calc = new Calculator();
		System.out.println("object created");
	}

@AfterClass
public static void	afterClass() {
		System.out.println("after class");
		calc = null;
		System.out.println("object cleared");
	}
	
	@Before
	public void before() {
		System.out.println("before");
		//prelogic eg file opning
		input1 = 10;
		input2 = 20;
		System.out.println(input1+input2);
	}
	
	@After
	public void after() {
		System.out.println("After");
		//reinitialze to 0
		//postlogic eg closing
		input1 = 0;
		input2 = 0;
		System.out.println(input1);
		System.out.println(input2);
		
	}

	@Test
	public void testAddition() {
		System.out.println("testcase1 addition");
	//	Calculator calc = new Calculator();
		int actual = calc.addition(10,20);
		int excepted = 30;
		assertEquals(excepted, actual);
		
	}

	@Test
	public void testSubtraction() {
		System.out.println("testcase2 subtraction");
		//Calculator calc= new Calculator();
		int actual = calc.subtraction(10, 20);
		int excepted = -10;
		assertEquals(excepted, actual);
	}

}
