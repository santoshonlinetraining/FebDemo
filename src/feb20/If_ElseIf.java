package feb20;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class If_ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int studentMarks = 2;
		
		if(studentMarks >= 60) {
			System.out.println("Grade A");
		}
		else if(studentMarks >= 50 && studentMarks <60) {
			System.out.println("Grade B");
		} 
		else if(studentMarks >= 35 && studentMarks <50) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("FAILED");
		} 
	}

}
