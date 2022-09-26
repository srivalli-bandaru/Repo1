package Oops;

public class Rectangle extends Area {
	void area()
	{System.out.println("Rectangle");
	}
	public static void main(String args[]){
	Area A=new Rectangle();
	A.Area();
	Rectangle R=new Rectangle();
	R.Area();
	}
}
