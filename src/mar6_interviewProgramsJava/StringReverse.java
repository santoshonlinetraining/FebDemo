package mar6_interviewProgramsJava;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abA";
		String strSave = "";
		
		int strlen = str.length();		
		
		for(int i=strlen-1; i>=0; i--){			
			
			strSave = strSave+""+str.charAt(i);
			
			System.out.print(str.charAt(i));
		}
		
		System.out.println("");
		
		if(strSave.contentEquals(str)) {
			System.out.println("palindrom==yes");
		} else {
			System.out.println("not a palindrom");
		}
		
		/*		
		int itr = 0;
		String store[] = new String[strlen];
		char c;
		String temp;
		for(int j=str.length()-1;j>=0;j--) {			
			System.out.println(str.charAt(j));
			c = str.charAt(j);
			temp = Character.toString(c);
			store[j] = temp;
			itr++;
		}
		System.out.println(store.length);
		
		for(int k=0; k<store.length;k++) {
			System.out.println(store[k]);
		}
		
		String str1 = "liril";
		String strRev = "";
		for(int i = str1.length()-1; i>=0; i--){
			strRev = strRev + str1.charAt(i);
		}
		
		System.out.println("OP: " + strRev);
		
		////
		System.out.println("==new==");
		String name = "santosh";
		String name2 = "";
		
		for(int i=name.length()-1; i>=0; i--){
			System.out.println(name.charAt(i));
			name2 = name2+name.charAt(i);
		}		
		System.out.println("new : " + name2);
*/
	}
}