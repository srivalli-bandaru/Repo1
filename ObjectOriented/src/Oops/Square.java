package Oops;

public class Square extends Area {
	void area()
	{System.out.println("Square");
	}
	public static void main(String args[]){
	Area A=new Square();
	A.Area();
	Square s=new Square();
	s.Area();
	}
}

