package mar1_this_OverLoading_OverRiding;

public class Math {
//Method over loading ex
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math obj = new Math();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(10, 20, 30, 40);
		
	}
	
	void add(int a, int b) {
		int c = a + b;
		System.out.println("sum of a and b is " + c);
	}
	
	void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("sum of a, b c is " + d);
	}
	
	void add(int a, int b, int c, int d) {
		int e = a + b + c + d;
		System.out.println("sum of a, b, c, d is " + e);
	}
	
	void add(int a, String b) {
		
	}
	
	void add(String a, int b) {
		
	}
	
	void add(String a, String b) {
		
	}

}
