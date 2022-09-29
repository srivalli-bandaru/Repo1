package Practice1;

import java.util.ArrayList;
import java.util.HashSet;
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
		
		System.out.println(list);
		Set set=new HashSet();
		set.add(1);
		set.add(2);
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(3);
		set.add(4);
		set.add(4);
		set.add(4);
		set.add(4);
	}	
	
}