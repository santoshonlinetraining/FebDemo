package mar6_interviewProgramsJava;

public class Find2ndLargestNumberFromArray {
	public static void main(String[] args) {
		int list[] = { 15, 24, 48, 100, 43, 11, 79, 93 };
		Find2ndLargestNumberFromArray max = new Find2ndLargestNumberFromArray();
		
        max.find2ndLarge(list);
	}
	
	public void find2ndLarge(int[] val){
		int large = 0;
		int secondLarge = 0;
		
		for(int i=0; i<val.length; i++){
			if(val[i] > large) {
				secondLarge = large;
				large = val[i]; 
			} else if (val[i] > secondLarge){
				secondLarge = val[i];
			}
		}
		
		System.out.println("first : " + large);
		System.out.println("second : " + secondLarge);
	}
	
}
