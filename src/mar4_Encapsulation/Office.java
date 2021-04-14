package mar4_Encapsulation;

public class Office {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp obj = new Emp();
		obj.setSalary(10000);
		System.out.println(obj.getSalary());
		
		obj.setDept("Cleaning");
		System.out.println(obj.getDept());
		
		obj.setBonus(20);
		System.out.println(obj.getBonus());
	
		
		
	}

}
