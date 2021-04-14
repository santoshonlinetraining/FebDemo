package feb20;

public class EqualityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 10;
		String c = "ten";
		String d = "ten";
		
		
		if(a == b) {
			System.out.println("a and b values are equal");
		} else {
			System.out.println("a and b values are NOT equal");
		}
		
		if(c == d){
			System.out.println("c and d values are equal");
		} else {
			System.out.println("c and d values are NOT equal");
		}
		
		if(c.equals(d)){
			System.out.println("c and d values are equal");
		} else {
			System.out.println("c and d values are NOT equal");
		}
		
		if(c != d) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}

}
