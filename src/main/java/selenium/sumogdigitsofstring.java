package selenium;

public class sumogdigitsofstring {

	public static void main(String[] args) {
		
		String s="1234";
		
		int sum=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
			
			if(Character.isDigit(ch))
			{
				int value = Character.getNumericValue(ch);
				
				sum=sum+value;
			}
			
		}
        System.out.println(sum);;
	}

}
