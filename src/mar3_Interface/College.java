package mar3_Interface;

public class College implements StudentECE, StudentCSC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College obj = new College();
		obj.marks();
		obj.studentRank();
	}
	
	public void marks() {
		System.out.println("Marks scored 100");
	}
	
	public void studentRank() {
		System.out.println("Rank is 1");
	}
	
	public void subject() {
		System.out.println("Subject is English");
	}
	
	public void lab() {
		System.out.println("Computer Lab");
	}

}
