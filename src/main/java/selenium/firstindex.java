package selenium;

public class firstindex {

	public static void main(String[] args) {
		
		String str = "Know Program";
		
		
		char ch='o';
//		System.out.println(str.indexOf('o'));
		
		System.out.println(str.indexOf(ch, str.indexOf(ch)+1));

	}

}
