package selenium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class stringtomap {

	public static void main(String[] args) {
	
		
		String s= "Apple:1, Banana:2, Mango:3";
		
		Map<String, String> map= new HashMap<String, String>();
		
	    String[] fruits =s.split(",");
	    
	    System.out.println(Arrays.toString(fruits));
	    
	   for (String fruit : fruits) {
		   
		   String string1[] = s.split(":");
	         String string2 = string1[0].trim();
	         String string3 = string1[1].trim();
	         map.put(string2, string3);
		
	}
	
	   System.out.println("String: " + s);
	      System.out.println("Map: " + map);
		
		

	}

}
