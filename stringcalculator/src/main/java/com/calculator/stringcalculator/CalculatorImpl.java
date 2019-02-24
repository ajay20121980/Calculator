/**
 * 
 */
package com.calculator.stringcalculator;

/**
 * This class is responsible to do all operations
 * @author ajay
 * @version 1.0
 *
 */
public class CalculatorImpl{
	/**
	 * @param num1
	 * @param num2
	 * @return double
	 */
	public double getAddition(double num1, double num2){
		Calculator calc = (n1,n2)->n1+n2;
		return calc.calculate(num1, num2);
	}
	
	/**
	 * @param num1
	 * @param num2
	 * @return double
	 */
	public double getSubtraction(double num1, double num2){
		Calculator calc = (n1,n2)->n1-n2;
		return calc.calculate(num1, num2);
	}
	
	/**
	 * @param num1
	 * @param num2
	 * @return double
	 */
	public double getMultification(double num1, double num2){
		Calculator calc = (n1,n2)->n1*n2;
		return calc.calculate(num1, num2);
	}
	
	/**
	 * @param num1
	 * @param num2
	 * @return double
	 */
	public double getDivision(double num1, double num2){
		Calculator calc = (n1,n2)->n1/n2;
		return calc.calculate(num1, num2);
	}
}
