package mar5_javaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("Shiva", 1);
		hm.put("Santosh", 2);
		hm.put("Pavan", 3);
		hm.put("Sindhu", 4);
		hm.put("Karishma", 5);
		hm.put("Pallavi", 6);
		hm.put("Sirisha", 7);
		hm.put("Ajay", 8);
		hm.put("Akil", 9);
		hm.put(null, 10);
		hm.put("Naveen", 10); // duplicating the value output is = (Naveen, 10)
		hm.put("Shiva", 12); // duplicating the index: Output is-> it will overwrite the exsitng (Shiva, 12) and it dont print the (Shiva , 1)
		hm.put("a", null);
		hm.put("b", null);
		hm.put(null, 11);
		
		System.out.println(hm);		
		
		//printing hashset
		Set hp = hm.entrySet();
		Iterator ip = hp.iterator();
		
		while(ip.hasNext()) {
			Map.Entry mp = (Map.Entry)ip.next();
			System.out.println(mp.getKey() + " " +mp.getValue());
		}
		
	}

}
