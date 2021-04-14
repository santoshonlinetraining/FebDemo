package mar6_interviewProgramsJava;

public class FindANumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int find = 4;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == find){
				System.out.println("number found");
				System.out.println("position of the number is : "+i);
				break;
			} else {
				System.out.println("not found at : " + i);
			}
		}
		
		System.out.println("done");
	}

}

