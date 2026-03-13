package selenium;

import java.util.ArrayList;
import java.util.List;

public class objecttostring {

	public static void main(String[] args) {
		
		
		
		List<String> list= new ArrayList<String>();
			
			list.add("pk");
			list.add("dk");
			list.add("gk");
			list.add("sk");
			
			Object object= list;
			
		List<String> liststring=  (List<String>) object;
			System.out.println(liststring);
			
	}

}
