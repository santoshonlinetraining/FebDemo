package mar6_interviewProgramsJava;

public class ReverseANumber {
	public long doInvert(long number) {
		long invert = 0;
		while (number != 0) {
			invert = (invert * 10) + (number % 10);
			number = number / 10;
		}
		return invert;
	}

	public static void main(String args[]) {
		long lnum = 161983;
		
		ReverseANumber input = new ReverseANumber();

		System.out.println("Input value : " + lnum);
		System.out.println("Inverted value : " + input.doInvert(lnum));
	}
}
