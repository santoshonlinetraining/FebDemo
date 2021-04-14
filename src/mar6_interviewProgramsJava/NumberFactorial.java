package mar6_interviewProgramsJava;

public class NumberFactorial {

public static void main(String[] args) {
		int value = 5;
		int factorial = value;
		for (int i = (value - 1); i>1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of number is " + factorial);
		
		//new code
		int sum = 1;
		int val = 5;
		for(int i=1; i<value; i++){
			System.out.println("=>" + val);
			sum = sum * val;
			val = val -1;		
		}
		System.out.println(sum);
	}
}