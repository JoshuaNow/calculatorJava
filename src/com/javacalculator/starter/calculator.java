package com.javacalculator.starter;

public class calculator {
	public static void main(String[] args) {
		
		div(2, 5);
	}
	
	public static void div(double num1, double num2) {
		if(num1 > num2) {
			System.out.println(num1 / num2 );
		}else {
			System.out.println("This calculator connot do that.");
		}
	}
		
		// this is the regular calculator
	public static void addStuff( double num1 , double num2) {
			System.out.println(num1 + num2);
		}
		
	public static void subStuff( double num1 , double num2) {
		System.out.println(num1 - num2);
	}
	
	public static void multiStuff( double num1 , double num2) {
		System.out.println(num1 * num2);
	}
	
	public static void divStuff( double num1 , double num2) {
		System.out.println(num1 / num2);
	}
	
	public static void moduStuff( double num1 , double num2) {
		System.out.println(num1 % num2);
	}
}
