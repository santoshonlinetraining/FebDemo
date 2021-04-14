package feb20;

public class NesterIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int studentMarks = 1;
		
		
		if(studentMarks >= 35 ) {
			if(studentMarks >= 60) {
				System.out.println("Grade A");
			}
			else if(studentMarks >= 50 && studentMarks <60) {
				System.out.println("Grade B");
			} 
			else if(studentMarks >= 35 && studentMarks <50) {
				System.out.println("Grade C");
			}
		}
		else {
			System.out.println("FAILED");
		}
		
		if(true) {
			System.out.println("i am from true block");
		} else {
			System.out.println("i am from false block");
		}
		
	}

}
