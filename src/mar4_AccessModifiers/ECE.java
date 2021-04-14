package mar4_AccessModifiers;

class ECE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College obj = new College();
		
		obj.library();
		obj.classRoom();
		obj.OfficeRoom();
		obj.Cafe();
		
		System.out.println(obj.salary);
		
		System.out.println(obj.StaffSalary);
		
		System.out.println(obj.FacultySalary);
	}

}
