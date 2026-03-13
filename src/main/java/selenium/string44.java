package selenium;

import java.util.Arrays;
import java.util.Scanner;

public class string44 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the no of elements:");

		
		int n= sc.nextInt();
		
		sc.nextLine();
		
		
		System.out.println("Enter "+n+" Strings:");
		
		String arr[]= new String[n];
		
		for (int i = 0; i < n; i++) {
			
			
			arr[i]=sc.nextLine();
			
			System.out.println("Entered string array: " 
                    + Arrays.toString(arr));
			
		}
	}

}
