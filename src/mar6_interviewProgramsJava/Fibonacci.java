package mar6_interviewProgramsJava;

public class Fibonacci {
	static int t1 = 0; 
	static int t2 = 1;
	static int t3 = 0;
	public static void main(String[] args) {
		//Fibona program by Santosh
		int t1,t2,t3;
		t1=0; 
		t2=1; 
		t3=0;
		int n = 10;
		for(int i=1; i<n; i++){
			System.out.print(t3+ " ");
			t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
		}
		//Fibona using reccursive
		System.out.println("");
		Fibonacci obj = new Fibonacci();
		obj.fibona(9);
		
		
		//new
		System.out.println("new");
		int a,b,c;
		a=0;
		b=0;
		c=1;
		for(int i=0; i<10; i++){
			a = b;
			b = c;
			c = a+b;
			System.out.println(c);
		}
System.out.println("done--");
		
	}
	
	static void fibona(int n) {
		if(n>0) {
			System.out.print(t3+ " ");
			t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
			fibona(n-1);
		}
	}
	
	
}