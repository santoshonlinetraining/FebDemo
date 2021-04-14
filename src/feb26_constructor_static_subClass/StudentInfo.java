package feb26_constructor_static_subClass;

public class StudentInfo {
	//Static keyword using with variable
	static String nameOfTheCollege = "Gauthami PG Collect";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentInfo obj = new StudentInfo();
		obj.printStudentInfo("karthik", "ECE", "Gauthami PG College");
		obj.printStudentInfo("Lakshmi", "EEE", "Gauthami PG College");
		obj.printStudentInfo("Renuka", "CSC", "Gauthami PG College");
	
	}
	
	//without static
	void printStudentInfo(String name, String Branch, String CollegeName) {
		System.out.println("Student Information");
		System.out.println("Student Name " + name);
		System.out.println("Student Branch " + Branch);
		System.out.println("Student Collect " + CollegeName);
	}
	
	//with static using
	void printStudentInfo2(String name, String Branch) {
		System.out.println("Student Information");
		System.out.println("Student Name " + name);
		System.out.println("Student Branch " + Branch);
		System.out.println("Student Collect " + nameOfTheCollege);
	}
}
