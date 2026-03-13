package selenium;

import java.util.Scanner;

public class vowelsandconsonants {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
     System.out.println("Enter the character:");
     
     String c= sc.next();
     
     int countvowels=0;
     int countconsonants=0;
     
   for (int i = 0; i < c.length(); i++) {
	   
	   char ch= c.charAt(i);
	   
	   
	   if(ch=='A' || ch=='E'|| ch=='I' || ch=='O' ||ch=='U')
		  
	   { 
		   countvowels++;
	   }
	   else if (ch>='A' && ch<='Z') {
		   
		   countconsonants++;
		
	}
}
     
     System.out.println(countvowels);
     System.out.println(countconsonants);
		
	}

}
