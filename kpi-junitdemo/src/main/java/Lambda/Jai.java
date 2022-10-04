package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Jai  {
	

	public Jai() {

			
		}
	
	public static void main(String[] args) {
    
    List<String> list=new ArrayList<String>();  
    list.add("chocolate");  
    list.add("Icecream");  
    list.add("sweet");  
    list.add("Tiffin");  
      
    list.forEach(  
        (n)->System.out.println(n)  
    );  
}


}

