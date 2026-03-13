package selenium;

import java.util.Arrays;

public class stringtointarray {

	public static void main(String[] args) {
		
		String[] stringArr = {"89", "12", "023", "458", "3158"};
		
		int[] arr= new int[stringArr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			 arr[i]=Integer.valueOf(stringArr[i]);
			
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
