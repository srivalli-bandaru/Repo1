package Oops;

 class Parent {
	 void Print()
	 {
		 System.out.println("parent class");
		 
	 }

}
class subclass1 extends Parent {
	void Print() {System.out.println("subclass1");}
	}
class subclass2 extends Parent {
	void print()
	{
		System.out.println("subclass2");

	}

}
class Polymorphism2{
	public static void main(String[] args)
	{
		Parent a;
		a = new subclass2();
		a.Print();
		a = new subclass1();
		a.Print();	
	}
}