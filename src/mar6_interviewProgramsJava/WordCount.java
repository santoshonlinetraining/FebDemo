package mar6_interviewProgramsJava;

public class WordCount {

	public static void main(String[] args) {

		String s = "Hello Java Selenium";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("No of words in a string = " + count);
	}
}

