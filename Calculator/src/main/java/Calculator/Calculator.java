package Calculator;

public class Calculator {
	protected  double num1;
	protected double num2;
	protected double result;
	public double Addition(double num1,double num2) {
		return result= num1 + num2;
		
	}
	public double subtraction(double num1,double num2) {
		return result= num1 - num2;
		
	}
	public double Multiply(double num1,double num2) {
		return result= num1 * num2;
		
	}
	public double division(double num1,double num2)  {
		if(num2==0) {
			throw new IllegalArgumentException("you can't divide by zero") ;
		}else {
		return result= num1 / num2;
		
	} }


}
