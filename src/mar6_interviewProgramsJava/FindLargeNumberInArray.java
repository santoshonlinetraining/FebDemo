package mar6_interviewProgramsJava;
public class FindLargeNumberInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 1, 3, 8, 50 };
		int large = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}
		}
		System.out.println("large number is : " + large);

		int aa[] = { 1, 2, 5, 2, 3, 8, 3, 10 };
		int largenumber = aa[0];
		for (int j = 0; j < aa.length; j++) {
			if (aa[j] > largenumber) {
				largenumber = aa[j];
			}
		}
		System.out.println("now large number is : " + largenumber);

	}
}