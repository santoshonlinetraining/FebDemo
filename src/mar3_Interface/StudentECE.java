package mar3_Interface;

public interface StudentECE {

	public static void main(String[] args) {
		System.out.println("Hello world");
	}
	
	public abstract void marks();
	
	void studentRank();
	
	default void test() {
		System.out.println("test");
	}
	
}
