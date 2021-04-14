package mar6_interviewProgramsJava;

public class ListEvenNumbers {
	public static void main(String[] args) {
		int value = 50;
		System.out.println("Print Even numbers between 1 and " + value);

		for (int i = 1; i <= value; i++) {
			// if the number is divisible by 2 then it is even
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
