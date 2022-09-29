package Practice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestCollection2 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		

		ArrayList<String> list = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		list.add("a");
		list.add("a");
		
		list2.add(1);
		
		Set<String> set=new HashSet<String>();
		Set set2=new HashSet();
		set.add("a");
		set.add("a");
		set2.add(1);
		System.out.println(set);
		System.out.println(list);
		
		
		Map<String, Integer> hm
		= new HashMap<String, Integer>();
		
		
		hm.put("a",  100);
		hm.put("b",  200);
		hm.put("c",  300);
		hm.put("d",  400);
		hm.put("a",  200);
		hm.get("a");
		System.out.println(hm);
}
}