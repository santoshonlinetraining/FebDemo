package mar4_AccessModifiers;

public class College {

	int salary = 10000;
	
	public int StaffSalary = 5000;
	
	protected int FacultySalary = 5000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//default method
	void library() {
		System.out.println("i do have many books");
	}
	//private method
	private void classRoom() {
		System.out.println("Hello i am from class room");
	}
	
	//protected method
	protected void OfficeRoom() {
		System.out.println("I am from Office room");
	}
	
	public void Cafe() {
		System.out.println("i provide everything for u");
	}

}
