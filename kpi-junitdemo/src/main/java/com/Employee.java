package com;

public class Employee implements Salary,Leaves{



	@Override
	public int emp_MonthSalary() {
		// TODO Auto-generated method stub
		System.out.println("20000");
		return 20000;
	}

	@Override
	public int emp_YearSalary() {
		// TODO Auto-generated method stub
		System.out.println("400000");
		return 400000;
	}

	public static void main(String[] args) {
		Employee2 e = new Employee2();
		e.emp_MonthSalary();
		System.out.println("20000");
	}

	@Override
	public int Leave(int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
