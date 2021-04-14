package feb24;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp obj = new Emp();
		System.out.println("Hello World");
		
		obj.dept();		
	}
	
	void address() {
		System.out.println("Miyapur, Hyderabad");
	}
	
	void dept() {
		System.out.println("IT Department");
		address();
	}
	

}
