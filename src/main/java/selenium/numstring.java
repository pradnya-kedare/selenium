package selenium;

import java.util.Arrays;

public class numstring {

	public static void main(String[] args) {
		
		
		 String s = "[00,45,89,33,45]";
		
		String[] p= s.replaceAll("\\[", "").replaceAll("]", "").split(",");
		
		System.out.println(Arrays.toString(p));
		 
		
		int[] a= new int[p.length];
		
		for (int i = 0; i < a.length; i++) {
			
			a[i]=Integer.valueOf(p[i]);
			
		}
		System.out.println(Arrays.toString(a));
	}

}
