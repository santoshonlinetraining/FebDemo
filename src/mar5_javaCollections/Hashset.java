package mar5_javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		
		System.out.println("working with Integers");
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(null);
		hs.add(40);
		hs.add(50);
		hs.add(30);
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("working with String");
		// with Strings
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("Santosh");
		hs1.add("SantosH");
		hs1.add("Shiva");
		//hs1.add(null);
		hs1.add("Pavan");
		hs1.add("Naveen");
		hs1.add("Shiva"); //duplicate
		
		System.out.println(hs1);
		System.out.println(hs1.size());
		
		Iterator<String> it2 = hs1.iterator();
		while(it2.hasNext()){
			String str = it2.next();
			
			if(str.equals("Santosh")) {
				System.out.println(it2.next());
				//
				//
				break;
			}
			
			
		}
		
	}

}
