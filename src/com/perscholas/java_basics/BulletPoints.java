package com.perscholas.java_basics;

import java.text.DecimalFormat;

public class BulletPoints {
	
	public void sumOfInts() {
		
		int int1 = 1;
		int int2 = 2;
		int result = int1 + int2;
		System.out.println("sumOfInts: " + result);
		
	}
	
	public void sumOfDbls() {
		
		double dbl1 = 1;
		double dbl2 = 2;
		double result = dbl1 + dbl2;
		System.out.println("sumOfDbls: " + result);

	}
	
	public void sumOfIntAndDbl() {
		
		int int1 = 1;
		double dbl1 = 2;
		double result = int1 + dbl1;
		System.out.println("sumOfIntAndDbl: " + result);
//		variable type of result must be double
		
	}
	
	public void divideTwoInts() {
		
		int int1 = 1;
		double int2 = 2.0;
		double result = int2 / int1;
		System.out.println("divideTwoInts: " + result);
//		spring won't run the program if an int has a decimal
//		the variables, int2 and result, need to be changed to data type double
	}
	
	public void divideTwoDbls() {
		
		double dbl1 = 1;
		double dbl2 = 2;
		double result = dbl2 / dbl1;
		System.out.println("divideTwoDbls: " + result);
//		how to cast a result to an integer?
	}
	
	public void divideTwoIntsCast() {
		
		int x = 5;
		int y = 6;
		int q = y / x;
		System.out.println("divideTwoIntsCast: " + q);
//		how to cast a y to a double and assign it to q?
	}
	
	public void useConst() {
		
		final int INT1 = 1;
		float result = INT1 + 1;
		System.out.println("useConst: " + result);
	}
	
	public void cafe() {
		
		final DecimalFormat df = new DecimalFormat("0.00");
		
		double coffee = 3.00;
		double cappuccino = 5.00;
		double greenTea = 3.00;
		double subtotal;
		double totalSale;
		final double SALES_TAX = 2.00;
		
		subtotal = 3 * coffee + 4 * cappuccino + 2 * greenTea;
		totalSale = subtotal + SALES_TAX;
		System.out.println("cafe: " + df.format(totalSale));
	}
	
}
