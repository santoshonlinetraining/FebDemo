package mar6_interviewProgramsJava;
import java.util.ArrayList;

public class FindDuplicateValueAndCountOfItFromArray {
	public static void main(String[] args) {
		int a[] = {4,4,4,5,3,5,2,9,2,1,4,3};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++){
			int k = 0;
			if(!al.contains(a[i])){
				al.add(a[i]);
				k++;
				for(int j=i+1; j<a.length; j++){
					if(a[i] == a[j]){
						k++;
					}
				}		
			//System.out.println(a[i]);
//				System.out.println(a[i]);	
			}
		}
		System.out.println(al);
	}
	
}
