package selenium;

import java.util.HashMap;
import java.util.Scanner;

public class charvhas {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the String:");
		
		String s= sc.next();
		
		
		HashMap<Character, Integer> countvowels= new HashMap<Character, Integer>();
		
		countvowels.put('a', 0);
		countvowels.put('e', 0);
		countvowels.put('i', 0);
		countvowels.put('o', 0);
		countvowels.put('u', 0);
		
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch= s.charAt(i);
			
			if(countvowels.containsKey(ch))
			{
				countvowels.put(ch,countvowels.get(ch)+1);
			}
			
		}
		
		
	for (Character vowelccount : countvowels.keySet()) {
			
			System.out.println(vowelccount+ ":" +countvowels.get(vowelccount));
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
