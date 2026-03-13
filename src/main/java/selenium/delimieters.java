package selenium;

import java.util.Arrays;

public class delimieters {

	public static void main(String[] args) {
		String string = "Java|Python|JavaScript|C++|PHP";
		
		String s1[]= string.split("\\|");

		
		System.out.println(Arrays.toString(s1));
	}

}
