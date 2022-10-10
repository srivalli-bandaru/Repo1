package com;

interface Employee1 {

	public  String man(String salary);
		// TODO Auto-generated method stub	

	}
		public class Employee2 {

		    public String Hello(Employee1 employee1, String salary) {
		        return employee1.man(salary);
		    }

		    public static void main(String[] args) throws Exception {

		        Employee2 emp = new Employee2();

		        Employee1 raj = (salary) -> "Hi, raj " + salary;
		        System.out.println(emp.Hello(raj, "20000"));

		    }

			public void emp_MonthSalary() {
				// TODO Auto-generated method stub
				
			}
		}


