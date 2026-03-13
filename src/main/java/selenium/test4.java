package selenium;

public class test4 {

	public static void main(String[] args) {
		
		
		String[] array = {"Hi", "Hello", "How are you"};
		
		
		for (String string : array) {
			int max=0;
			String longest="";
			 System.out.println(string.length());
			
			 if(string.length()>max)
			 {
				  max= string.length();
				  longest= string;
				  
					 }
			 System.out.println(longest);
			
		}
		
		
	}

}
