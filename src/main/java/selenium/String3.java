package selenium;

public class String3 {

	public static void main(String[] args) {
		
//		String s="000001swd23569";
		 String s = "Hello!@# World$%^";
		
//		String result=s.replaceAll("^0+", "");
		
		
		
		String result= s.replaceAll("[^A-Za-z0-9]", "");
		
		System.out.println(result);
	}

}
