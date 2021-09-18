package CalculatorTest;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.Scanner;


import Calculator.Calculator;

public class TestCalclus extends Calculator {


	Scanner sc= new Scanner(System.in);
	 
	double number1=sc.nextDouble();
	double number2=sc.nextDouble();



@Test
	public void TestAddition() {
	 Addition(number1,number2);
assertEquals(number1+number2, result);
System.out.println(" this result of addition "+ result);

		
	}
@Test

public void TestSubtraction() {
	subtraction(number1,number2);
assertEquals(number1-number2, result);
System.out.println(" this result of subtraction "+ result);

		
	}
@Test

public void TestMultiplication() {
	Multiply(number1,number2);
	assertEquals(number1*number2, result);
	System.out.println(" this result of Multiplication "+ result);

}
@Test
public void TestDivision() {
	division(number1,number2);
	assertEquals(number1/number2, result);
	System.out.println(" this result of division "+ result);

}
}



