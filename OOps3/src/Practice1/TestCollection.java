package Practice1;

import java.util.ArrayList;

/**
 * @author SrivalliBandaru
 *
 */
public class TestCollection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList list2 = new ArrayList();

		list.add("x");
		list.add("z");
		//list.add(11);
		//list2.add(11);
		//System.out.println(list.get(1));
		//System.out.println(list);
		//System.out.println(list2);
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i)=="z")//i=0,1....
			System.out.println(i);
	}
		for(int j=0; j<10; j++)
		{
		 list2.add(j);
		 
		}
		System.out.println(list2);
}
}

