package mar6_interviewProgramsJava;

public class GetTheIndexOfNumberInArray {

	//Get The Index Of Number In Array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9,0};
		int pos=7;
		for(int i=0; i<a.length; i++){
			if(a[i] == 7) {
				System.out.println(i);
				break; // use this break to exist the loop
			}
		}
	}

}
