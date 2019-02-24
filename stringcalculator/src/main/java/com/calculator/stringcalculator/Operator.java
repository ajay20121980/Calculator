/**
 * 
 */
package com.calculator.stringcalculator;

/**
 * Not in use 
 * @author ajay
 * @version 1.0
 *
 */
public enum Operator {
 PLUS('+'),MINUS('-'),MULTI('*'),DIVIDE('/');
	public final char name; 
	Operator(char value) {
	this.name = value; 
	}
	
	public char getVal(){
		return name;
	}
}

