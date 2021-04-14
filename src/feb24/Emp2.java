package feb24;

public class Emp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp2 obj = new Emp2();
		obj.add();
		obj.add2(50, 60);
		obj.address("Shiva", "HimayathNagar");
		obj.Salary("Santosh", 1000);
	}
	
	public void add() {
		int a,b,c;
		a = 10;
		b= 20;
		c = a + b;
		System.out.println("Add: sum of a and b is " + c);
	}

	void add2(int a, int b) {
		int c;
		c = a + b;
		System.out.println("Add2: sum of and b is " + c);
	}
	
	void address(String name, String Address) {
		System.out.println("Name of the emp is " + name + "Address is " + Address);
	}
	
	void Salary(String Name, int Salary) {
		System.out.println("Emp Name " + Name + " Emp Salary " + Salary);
	}
}
