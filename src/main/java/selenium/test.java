package selenium;

public class test {

	public static void main(String[] args) {


		String s="Rachel Mariam Don";
		
		String rev="";
		
		String arr[]= s.split(" ");
		
		System.out.println(arr);
		
		
		for (int i = 0; i < arr.length; i++) {
			
		
		
		for (int j = s.length()-1; j>=0; j--) {
			
			rev= rev+s.charAt(j);
			
			
		}
		
		System.out.println(rev);
		System.out.println(arr);
		
	}
		
		

}
}