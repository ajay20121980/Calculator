/**
 * 
 */
package com.calculator.stringcalculator;

/**
 * @author ajay
 * @version 1.0
 *
 */
@FunctionalInterface
public interface Validator {
	public boolean validate(String statement);
}
