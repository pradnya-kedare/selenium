package selenium;

import java.util.ArrayList;
import java.util.List;

public class objectlist {

	public static void main(String[] args) {
		
		List<Object> objects= new ArrayList<Object>();
		
		objects.add("pk");
		objects.add(0.1);
		objects.add('r');
		objects.add(true);
		
		List<String> list= new ArrayList<String>();
		for (Object object : objects) {
			
			list.add(String.valueOf(object));
			}
		System.out.println("List:" +list);
		
		
	}

}
