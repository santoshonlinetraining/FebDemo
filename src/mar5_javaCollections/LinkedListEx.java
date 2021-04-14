package mar5_javaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> arrList = new LinkedList<String>();
		arrList.add("Santosh");
		arrList.add("Akil");
		arrList.add("Karishma");
		arrList.add("Sindhu");
		
		System.out.println(arrList);
		
		//printing results using Iterator... but it will print the values randomly 
		Iterator itr = arrList.iterator();// getting the Iterator
		while (itr.hasNext()) {					// check if iterator has the elements
			if(itr.next().equals("Akil")) {
				//
				//
				//
				break;
			}
			System.out.println(itr.next());		// printing the element and move to next
			
		}		
		
		//print using foreach
		for (String name : arrList)
			System.out.println(name);

		System.out.println("changing the index");
		arrList.add(2, "Ajay");
		arrList.add(1, "Pallavi");
		arrList.add(3, "Ajay2");
		//print using foreach
		for (String name : arrList)
			System.out.println(name);
		
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
		
		
	}

}
