package selenium;

import java.util.Scanner;

public class Stringsss {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the String:");
		
		String s= sc.next();

//		System.out.println(s.length());
		
		
		char[] ch= s.toCharArray();
		
		int count=0;
		
		for (char c : ch) {
			count++;
			
		}
		System.out.println(count);
	}

}
