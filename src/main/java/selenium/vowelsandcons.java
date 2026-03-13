package selenium;

public class vowelsandcons {

	public static void main(String[] args) {
		
		
		String s="KnowProgram@2025";
		
		s= s.toLowerCase();
		int vovels=0;
		int consonants=0;
		for (int i = 0; i < s.length(); i++) {
			
			
			char c= s.charAt(i);
			
			if(c=='a'||c=='o'||c=='e'||c=='i'||c=='u')
			{
				vovels++;
				
			}else {
				consonants++;
							}
			
		}
		System.out.println("vovels:" +vovels);
		System.out.println("consonant:" +consonants);

	}

}
