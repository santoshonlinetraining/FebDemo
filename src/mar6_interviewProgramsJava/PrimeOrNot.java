package mar6_interviewProgramsJava;

public class PrimeOrNot {
	public static void main(String[] args) {
		int input = 43;
		if (checkPrime(input)) {
			System.out.println("Input value " + input + " is a prime number.");
		} else {
			System.out.println("Input value " + input
					+ " is not a prime number.");
		}
	}

	public static boolean checkPrime(int n) {
		if (n <= 1) {
			return false;
		}
		System.out.println("==>"+Math.sqrt(n));
		for (int i = 2; i < n; i++) {
			System.out.println(i);
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean test(int val){
		if(val <= 1) {
			return false;
		} 
		for(int i=2; i<val; i++){
			if(val % i == 0) {
				return false;
			}
		}
		return true;
	}
}
