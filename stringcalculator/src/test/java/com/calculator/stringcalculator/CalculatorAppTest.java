package com.calculator.stringcalculator;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ajay
 * @version 1.0
 */

public class CalculatorAppTest
{
	CalculatorApp calc = null;
	
	@Before
	public void init(){
		calc = new CalculatorApp();
	}
	
	
	@Test
	public void test1(){
		int testCaseNo = 1;
		List<String> inputList = new ArrayList<>();
		String exp1 = "(";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#1: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test2(){
		int testCaseNo = 2;
		List<String> inputList = new ArrayList<>();
		String exp1 = "((";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#2: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test3(){
		int testCaseNo = 3;
		List<String> inputList = new ArrayList<>();
		String exp1 = "*";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#3: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test4(){
		int testCaseNo = 4;
		List<String> inputList = new ArrayList<>();
		String exp1 = "**";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#4: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test5(){
		int testCaseNo = 5;
		List<String> inputList = new ArrayList<>();
		String exp1 = ")";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#5: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test6(){
		int testCaseNo = 6;
		List<String> inputList = new ArrayList<>();
		String exp1 = "2**";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#6: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test7(){
		int testCaseNo = 7;
		List<String> inputList = new ArrayList<>();
		String exp1 = "**";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#7: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test8(){
		int testCaseNo = 8;
		List<String> inputList = new ArrayList<>();
		String exp1 = "%";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#8: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test9(){
		int testCaseNo = 9;
		List<String> inputList = new ArrayList<>();
		String exp1 = "**";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#9: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test10(){
		int testCaseNo = 10;
		List<String> inputList = new ArrayList<>();
		String exp1 = "**";
		String exp2 = "#";
		inputList.add(exp1);
		inputList.add(exp2);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#10: INVALID EXPRESSION");
		expectedOutputList.add("Case	#10: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test11(){
		int testCaseNo = 11;
		List<String> inputList = new ArrayList<>();
		String exp1 = "*";
		String exp2 = "(";
		String exp3 = ")";
		inputList.add(exp1);
		inputList.add(exp2);
		inputList.add(exp3);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#11: INVALID EXPRESSION");
		expectedOutputList.add("Case	#11: INVALID EXPRESSION");
		expectedOutputList.add("Case	#11: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test12(){
		int testCaseNo = 12;
		List<String> inputList = new ArrayList<>();
		String exp1 = "a";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#12: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test13(){
		int testCaseNo = 13;
		List<String> inputList = new ArrayList<>();
		String exp1 = "2";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#13: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test14(){
		int testCaseNo = 14;
		List<String> inputList = new ArrayList<>();
		String exp1 = "2+";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#14: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	
	@Test
	public void test15(){
		int testCaseNo = 15;
		List<String> inputList = new ArrayList<>();
		String exp1 = "2+2";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#15: 4.0");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	@Test
	public void test16(){
		int testCaseNo = 16;
		List<String> inputList = new ArrayList<>();
		String exp1 = "2-2";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#16: 0.0");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	
	@Test
	public void test17(){
		int testCaseNo = 17;
		List<String> inputList = new ArrayList<>();
		String exp1 = "12*12/2";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#17: 72.0");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	
	@Test
	public void test18(){
		int testCaseNo = 18;
		List<String> inputList = new ArrayList<>();
		String exp1 = "2+12*2-5";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#18: 23.0");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	
	@Test
	public void test19(){
		int testCaseNo = 19;
		List<String> inputList = new ArrayList<>();
		String exp1 = "2+(12(";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#19: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}
	
	@Test
	public void test20(){
		int testCaseNo = 20;
		List<String> inputList = new ArrayList<>();
		String exp1 = "2+)12)";
		inputList.add(exp1);
		List<String> expectedOutputList = new ArrayList<String>();
		expectedOutputList.add("Case	#20: INVALID EXPRESSION");
		List<String> actualOutputList = calc.getResult(testCaseNo, inputList);
		assertOutput(expectedOutputList, actualOutputList);
	}

	private void assertOutput(List<String> expectedOutputList, List<String> actualOutputList){
		Assert.assertEquals(expectedOutputList.size(), actualOutputList.size());
		for(int i=0; i < expectedOutputList.size(); i++){
			Assert.assertEquals(expectedOutputList.get(i), actualOutputList.get(i));
		}
	}
	
}
