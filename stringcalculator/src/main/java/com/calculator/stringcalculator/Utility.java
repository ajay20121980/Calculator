/**
 * 
 */
package com.calculator.stringcalculator;

/**
 * @author ajay
 * @version 1.0
 *
 */
public class Utility {
	/**
	 * @param input
	 * @return String []
	 * This method will take the input string and break it into 
	 * array of String ie. number and operator
	 */
	public static String[] getPrepareStatement(String input){
		return input.split("[0-9]+(?<=[-+*/()])|(?=[-+*/()])");
	}
}
