package mar4_University;

import mar4_AccessModifiers.College;

public class OU extends College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College obj = new College();
		
		OU obj2 = new OU();
		
		obj.library();
		
		obj.classRoom();
		
		obj.OfficeRoom();
		
		obj2.OfficeRoom();
		
		obj.Cafe();
		
		System.out.println(obj.salary);
		
		System.out.println(obj.StaffSalary);
		
		System.out.println(obj.FacultySalary);
		
		System.out.println(obj2.FacultySalary);
	}

}
