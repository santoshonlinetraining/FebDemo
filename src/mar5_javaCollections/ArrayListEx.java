package mar5_javaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Santosh");
		arrList.add("Akil");
		arrList.add("Karishma");
		arrList.add("Sindhu");
		arrList.add("Sindhu");
		arrList.add("");
		
		/*System.out.println(arrList);
		
		
		Iterator itr = arrList.iterator();// getting the Iterator
		while (itr.hasNext()) {					// check if iterator has the elements
			System.out.println(itr.next());		// printing the element and move to next
		}
		
		
		//printing results using Iterator... but it will print the values randomly 
		Iterator itr2 = arrList.iterator();// getting the Iterator
		while (itr2.hasNext()) {					// check if iterator has the elements
			if(itr2.next().equals("Akil")) {
				System.out.println("Akil Name is exist in Array List");
				break;
			}
		}*/
		
				
		System.out.println("====");
		arrList.add(2, "Ajay");
		//print using foreach
		for (String name : arrList)
			System.out.println(name);

		System.out.println("====");
		arrList.add(1, "Pallavi");
		//print using foreach
		for (String name : arrList)
			System.out.println(name);

		System.out.println("====");
		arrList.add(3, "Ajay2");
		//print using foreach
		for (String name : arrList)
			System.out.println(name);
		
		System.out.println("====");
		arrList.remove(3);
		for (String name : arrList)
			System.out.println(name);
		
		System.out.println("====");
		for(int i=0; i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		
		

		
/*		System.out.println("after adding lakshmi");
		arrList.add(1, "Lakshmi");
		for (String name : arrList)
			System.out.println(name);
*/		
		
		/*
		System.out.println("remove 4th index value");
		arrList.remove(4);
		//print using foreach
		for (String name : arrList)
			System.out.println(name);
		
		
		//printing values using forloop
		int count = arrList.size();
		System.out.println("no of values in array list " + count);
		
		for(int i=0; i<count; i++) {
			System.out.println(arrList.get(i));
		}
		
		//print using foreach
		for (String name : arrList)
			System.out.println(name);
		*
		*/
		
		
	}

}
