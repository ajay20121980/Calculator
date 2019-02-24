package com.calculator.stringcalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajay
 * @version 1.0
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<String> exprLst = new ArrayList<String>();
    	exprLst.add("7+5+6-2+3*2");
		List<String> resultList = new CalculatorApp().getResult(1, exprLst);
		resultList.forEach(System.out::println);
	}
    
   
}
