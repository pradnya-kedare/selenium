package selenium;

import java.util.Scanner;

public class VOWCON {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter the String:");
	
	String s= sc.next();
	int countvowel=0;
	int countconsonants=0;
	
	for (int i = 0; i < s.length(); i++) {
		
		char ch= s.charAt(i);
		
		if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u')
		{
			countvowel++;
		}else if (ch>='a' && ch <='z') {
			countconsonants++;
		}
		
		
		
	}
	
	System.out.println("countvowel:"+countvowel);
	System.out.println("countconsonants :" +countconsonants);

	}

}
