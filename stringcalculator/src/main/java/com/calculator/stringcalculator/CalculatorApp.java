/**
 * 
 */
package com.calculator.stringcalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is Responsible to evaluate the expression
 * which will call by test class.
 * @author ajay
 * @version 1.0
 *
 */
public class CalculatorApp {
	private  static final String INVALID_EXPRESSION=": INVALID EXPRESSION";
	private static final String TEST_CASE="Case	#";
	private static final String COLON = ": ";
	private static final char PLUS = '+';
	private static final char MINUS = '-';
	private static final char MULTI = '*';
	private static final char DIVIDE = '/';

	/**
	 * This method will take the input as test case no. and List of expression
	 * and call eval method and return the list of results.
	 * @param testCaseNo
	 * @param lst
	 * @return resultLst
	 */
	 public List<String> getResult(int testCaseNo, List<String> lst){
	    	final List<String> resultLst = new ArrayList<String>();
	    	lst.forEach(expression->
	    	{
	    		if(new ValidatorImpl().getValidate(expression)){
	    			String[] inputArr = Utility.getPrepareStatement(expression);
	    			double result  = getEval(inputArr);
	    			resultLst.add(TEST_CASE+testCaseNo+COLON+String.valueOf(result));
	    		}else{
	    			resultLst.add(TEST_CASE+testCaseNo+INVALID_EXPRESSION);
	    		}
	    	});
	    	return resultLst;
	    }

	 /**
	  * This helper method will evaluate the expression 
	  * on behalf of input array and provide the result.
	  * @param strarr
	  * @return
	  */
		private double getEval(String [] strarr){
			int size = strarr.length;
			double  result = Double.parseDouble(strarr[0]);
			int i=0;
			double num2;
			char op;
			while(i<size-1){
				op = strarr[i+1].charAt(0);
				num2 = Double.parseDouble(strarr[i+1].substring(1));
				result = operation(op, result, num2);
				i++;
			}return result;
		}
		
		/**
		 * This Helper method will decide which operation
		 * need to perform.
		 * @param operand
		 * @param num1
		 * @param num2
		 * @return result
		 */
		private double operation(char operand, double num1, double num2){
			double result;
			CalculatorImpl ci = new CalculatorImpl();
			switch(operand){
			case PLUS : result = ci.getAddition(num1, num2);break;
			case MINUS : result = ci.getSubtraction(num1, num2);break;
			case MULTI : result = ci.getMultification(num1, num2);break;
			case DIVIDE : result = ci.getDivision(num1, num2);break;
			default  :  result=0.0;break;
			}
			return result;
		}
}
