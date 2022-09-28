package Practice;

 interface TestInterface1 {

	 void addition(int a , int b);
	 default void show()
	 {
		 System.out.println("Default method");
		 
	 }
}
class DefaultS implements TestInterface1
{

	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + b);
		
	}
	public static void main (String[] args) {
		DefaultS d = new DefaultS();
		d.addition(3, 4);
		d.show();
	}
}