package feb26_constructor_static_subClass;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp obj = new Emp();
		obj.abc();
		Emp obj2 = new Emp(10, 20);
	}
	
	Emp() {
		System.out.println("Hello all i ma from Constructor");
	}
	
	Emp(int a, int b) {
		int c = a+b;
		System.out.println("sum of a and b is " + c);
	}
	
	void abc() {
		System.out.println("Hello all i am from ABC method");
	}

}
