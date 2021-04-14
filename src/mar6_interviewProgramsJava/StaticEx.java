package mar6_interviewProgramsJava;

public class StaticEx {
	static int a = 10;
	static int b = 20;
	public static void main(String[] args){
		a = 20;
		System.out.println(a);
		StaticEx obj = new StaticEx();
		obj.test();
		obj.test2();
	}
	
	void test(){
		test3();
		a = 30;
		b = 40;
		System.out.println(b);
	}
	
	void test2(){
		System.out.println(b);
	}
	
	void test3(){
		System.out.println(b);
	}
}
