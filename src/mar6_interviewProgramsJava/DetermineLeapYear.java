package mar6_interviewProgramsJava;

public class DetermineLeapYear {
	public static void main(String[] args) {
		int year = 2024;
		
		if ((year % 4 == 0)) {
			System.out.println("Year " + year + " is a leap year");
		} else {
			System.out.println("Year " + year + " is not a leap year");
		}
	}
}
