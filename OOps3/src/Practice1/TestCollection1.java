package Practice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author SrivalliBandaru
 *
 */
public class TestCollection1 {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
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
		hm.put("e",  100);
		
		System.out.println(hm);
}
}
