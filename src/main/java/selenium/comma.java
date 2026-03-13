package selenium;

import java.util.Arrays;
import java.util.List;

public class comma {

	public static void main(String[] args) {
	
		
		String s = "Java, Programming, Python";
		
		String s1[]= s.split(",");
		
		List<String> list= Arrays.asList(s1);
		
		System.out.println("List: " +list);
		
		System.out.println(Arrays.toString(s1));

	}

}
