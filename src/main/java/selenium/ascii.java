package selenium;

import java.util.Arrays;

public class ascii {

	public static void main(String[] args) {
		try {
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		byte[] bytes= txt.getBytes("US_ASCII");
	
			
			System.out.println("ASCII: " + Arrays.toString(bytes));
			
			
		 } catch (java.io.UnsupportedEncodingException e) {
	         e.printStackTrace();
	      }
	

	}

}
