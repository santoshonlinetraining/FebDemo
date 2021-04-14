package mar6_interviewProgramsJava;

public class FindLeastNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,1,3,8,50};
		int low=a[0];
		for(int i=0; i<a.length; i++) {			
			if(a[i]<low) {
				low = a[i];
			}
		}		
		System.out.println("low number is : "+low);		
	}
}
