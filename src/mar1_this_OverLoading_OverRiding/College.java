package mar1_this_OverLoading_OverRiding;

import java.util.Properties;

public class College {

	String collegeName = "Gauthami PG College";
	
	String Address = "Hyderabad";
	
	void printStudentInfo(String name, String branch, String collegeName) {
		System.out.println("Name of the student is " + name);
		System.out.println("Student branch is  " + branch);
		System.out.println("College Name  " + collegeName);
		System.out.println("Address is " + Address);
		this.Library();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College obj = new College();
		obj.printStudentInfo("Harsha", "ECE", "OU");
		//obj.Library();
	}
	
	void Library() {
		System.out.println("I am from Library, i do have many books");
	}

	College(){
		
		System.out.println("Welcome students");
	}
	
}
