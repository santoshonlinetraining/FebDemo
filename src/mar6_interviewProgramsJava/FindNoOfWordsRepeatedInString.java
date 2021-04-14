package mar6_interviewProgramsJava;

import java.util.HashMap;

public class FindNoOfWordsRepeatedInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this This is is Santosh kumar Gaddam kumar";
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		String arr[] = str.split(" ");
		int length = arr.length;
		
		for(int i = 0;i<length; i ++){
			if(hm.containsKey(arr[i])) {
				int count = hm.get(arr[i]);
				hm.put(arr[i], count+1);
			} else {
				hm.put(arr[i], 1);
			}
		}		
		System.out.println(hm);
		
		System.out.println("===new===");
		String str1 = "this This is is Santosh kumar Gaddam kumar";
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		
		String[] str2 = str1.split(" ");
		
		for(int i=0; i<str2.length; i++){
			if(hm1.containsKey(str2[i])) {
				int val = hm.get(str2[i]);
				hm1.put(str2[i], val +1);
			} else {
				hm1.put(str2[i], 1);
			}
		}
		System.out.println(hm1);
	}
}
