package mar6_interviewProgramsJava;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int arraySum = 0;
		
		int lengthOfArray = a.length;
		
		for(int i = 0; i<lengthOfArray; i ++){
			arraySum = arraySum + a[i]; 
		}
		
		System.out.println("Sum Of Array : " + arraySum);		
	}

}
