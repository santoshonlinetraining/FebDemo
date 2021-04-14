package mar6_interviewProgramsJava;

public class GivenSumOf2Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 96;
		int res =  a%10 + (a/10);
		System.out.println("==>"+res);
		
		int n = 159;
		int sum = 0;
		int temp;
		while(n>0){
			temp = n % 10;
			sum = sum + temp;
			n = n/10;
		}
		System.out.println("Ne sum : " + sum);
	}
}
