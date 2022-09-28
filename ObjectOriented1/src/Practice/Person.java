package Practice;

public class Person {
	private String name;
	private char gender;
	
	public Person(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	public void print() {
		System.out.println(this.name);
		System.out.println(this.gender);
	}

}
