package com;

interface MathOperation {

	int operation(int a, int b);
}

public class Lambda1 {
	private int operate(int a , int b, MathOperation mathOperation) {
		return mathOperation.operation(a,b);
	}
public int subtraction(int a, int b) { return a + b; }

	
	public static void main(String[] args) {
		Lambda1 tester = new Lambda1();
		
		MathOperation addition = (int a, int b) -> a + b;
		
		MathOperation subtraction = (a,b) -> a - b;
		
		MathOperation multiplication  = (a,b) -> {return a * b;};
		
		MathOperation division = (int a, int b) -> a / b;
		
		System.out.println(tester.operate(5,6,addition));
		System.out.println(tester.operate(5,6,subtraction));
		System.out.println(tester.operate(5,6,multiplication));
		System.out.println(tester.operate(5,6,division));
	}
}
