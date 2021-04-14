package mar6_interviewProgramsJava;

public class FindALetterInString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "digital cutlet";
		
		System.out.println("length of the string is " + a.length());
		
		System.out.println(a.contains("digi")); // find a word from given string using in-build method
		
		System.out.println(a.indexOf("l")); // in-build method to find the index of a string
		
		for(int i=0; i<a.length(); i++) {
			//System.out.println(a.charAt(i));
			if(a.charAt(i) == 'l') {
				System.out.println("found n at : " + i);
				//break; //break the for loop
			}
		}
		
	
		}
}
