
package mar6_interviewProgramsJava;

public class ArmStrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int org = n;
		
		int temp;
		
		int sum = 0;
		
		while(n>0) {
			
			temp = n%10;
			System.out.println(temp);
			sum = sum + (temp * temp * temp);
			n = n/10;
			
		}
		System.out.println(sum);
	
		if(org == sum) {
			System.out.println("given number is ArmStrong Number");
		} else {
			System.out.println("given number is NOT an ArmStrong Number");
		}
	}
	
	
}

//1x1x1+5x5x5+4x4x4
