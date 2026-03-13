package selenium;

import java.util.HashMap;
import java.util.Scanner;

public class repeatedcharacters {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the string:");
		
	  String n=	sc.next();
		
		
		HashMap<Character, Integer> wordcount = new HashMap<Character, Integer>();
		
		
		for (int i = 0; i <n.length(); i++) {
			
			
			char ch= n.charAt(i);
			
			if(wordcount.containsKey(ch))
			{
				wordcount.put(ch,wordcount.get(ch)+1);
			}
			else
			{

				wordcount.put(ch,1);
			}
			
			
		}
		
		
		for (char letter : wordcount.keySet()) {
			

			
			System.out.println(letter +":"+wordcount.get(letter));
			
		}
		
		
		
		
		
	}

}
