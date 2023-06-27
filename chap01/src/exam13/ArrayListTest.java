package exam13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("DataBase");
		list.add("Jsp/Servlet");
		list.add(2, "iBatis");
		list.add("React");
		
		System.out.println(list.size()); 
		System.out.println();
		
	    System.out.println(list.get(2)); 
	    System.out.println();
	    
	    for(int i=0; i<list.size();i++) {
	    	System.out.println(list.get(i));
	    }
	    
	    System.out.println();
	    
	    list.remove(2);
	    list.remove(2);
	    list.remove("iBatis");
	    
	    for(String str : list) {
	    	System.out.print(str+" ");
	    }
		

	}

}
