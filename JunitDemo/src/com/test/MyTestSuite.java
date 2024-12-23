package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



//combine all test case togeather
@RunWith(Suite.class)
@SuiteClasses({
	CalculatorTest.class,
	CalculatorTest2.class,
	FactorialExampleTest.class
})
public class MyTestSuite {

}
