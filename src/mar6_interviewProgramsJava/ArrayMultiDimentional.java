package mar6_interviewProgramsJava;

public class ArrayMultiDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4  2  30
		//40 10 6
		//1  80 90
		int a[][] = {{4,2,30},{40,10,6},{10,80,90}};
		for(int i=0;i<a.length; i++){
			for(int j=0;j<a[i].length;j++){
				//System.out.print(a[i][j]);
				if(a[i][j] == 2) {
					System.out.println("found at pos : " + i +" "+j);
				}
			}
		}
		
		int low=a[0][0];
		int columNum = 0;
		for(int i=0;i<a.length; i++){
			for(int j=0;j<a[i].length;j++){
				//System.out.print(a[i][j]);
				if(a[i][j] < low) {
					//System.out.println("current low is : " + a[i][j]);
					low = a[i][j];
					columNum = j;
				} 
			}
		}
		
		//Low Number in Matrix is 
		int max = a[0][columNum];		
		for(int i=0; i<3; i++){
			if(max <a[i][columNum]){
				max = a[i][columNum];				
			}
		}
		System.out.println("max number is : " + max);
	}
}
