package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stringlisttoarray {

	public static void main(String[] args) {
	
		
		List<String> list= new ArrayList<String>();
		
		 list.add("Java");
	     list.add("Programming");
	     list.add("Language");

	     String[] array=list.toArray(new String[] {});
	     
	     System.out.println(Arrays.toString(array));
	}

}
