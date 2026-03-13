package selenium;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		
		
		 List<String> list = new ArrayList<String>();
	        list.add("Pro");
	        list.add("gram");
	        list.add("ming");
	        System.out.println("List: " + list);
	        
	        
	        String string="";
	        
	        for (String str : list) {
	        	
	        	string =string.concat(str);
				
			}
	        
	        System.out.println(string);
	}

}
