/**
 * 
 */
package com.calculator.stringcalculator;

import java.util.regex.Pattern;

/**
 * This class will validate the expression
 * @author ajay
 * @version 1.0
 */
public class ValidatorImpl {
	/**
	 * This method will validate the expression
	 * which is coming into input.
	 * @param statement
	 * @return valid
	 */
	public boolean getValidate(String statement){
		Validator valid = s->{
			return Pattern.matches("^(\\d+\\s*(\\*|\\/|\\+|\\-)\\s*)+\\d$",s);
		};
		return valid.validate(statement);
	}
}
