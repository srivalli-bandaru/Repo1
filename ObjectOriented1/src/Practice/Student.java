package Practice;

public class Student extends Person {
	private String course;
	
	public Student(String name, char gender, String course) {
		super(name, gender);
		this.course = course;
		// TODO Auto-generated constructor stub
	}
public void print() {
	super.print();
	System.out.println(this.course);
}
	
	

}
