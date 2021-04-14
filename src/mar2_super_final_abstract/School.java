package mar2_super_final_abstract;

public class School extends  Student{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School obj = new School();
		
		obj.marks();
		
		obj.rank();
	}
	
	void rank() {
		System.out.println("Studen rank is 1st");
	}

}
