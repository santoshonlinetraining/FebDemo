package mar2_super_final_abstract;

public abstract class Student {
	
	
	void marks() {
		System.out.println("student scored 100 marks");
	}
	
	abstract void rank();
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Welcome Student");
	}
	
	public static void main(String[] args) {
		//Student obj = new Student(); // Abstract class dont allow object creation.
		
	}
}
