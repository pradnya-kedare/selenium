package selenium;

public class stringcon1 {

	public static void main(String[] args) {
		
		
		String s= "KnowProgram2030";
		try {
			int n= Integer.parseInt(s);
			
			System.out.println(n);
			
			
		} catch (NumberFormatException e) {   
			System.out.println(e.toString());
		}
		

	}

}
