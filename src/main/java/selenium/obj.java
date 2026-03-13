package selenium;

import java.util.ArrayList;
import java.util.List;

public class obj {

	public static void main(String[] args) {
		
		 List<Object> objects = new ArrayList<Object>();
	        objects.add("Hello");
	        objects.add(9);
	        objects.add(40.99);
	        objects.add(true);

	      
	        List<String> listString = new ArrayList<String>();
	        for (Object object : objects) {
	            listString.add(String.valueOf(object));
	        }

	        // display list
	        System.out.println("List: " + listString);

	}

}
