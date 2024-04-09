package Strings;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = "Sudarshan Pansare";
		System.out.println(str);
		
		//convert lower case
		System.out.println(str.toLowerCase());
		
		//upper case
		System.out.println(str.toUpperCase());
		
		System.out.println(str.equals("Sudarshan"));
		
		System.out.println(str.endsWith("Pansare"));
		
		System.out.println(str.startsWith("Sudarshan"));
		
		System.out.println(str.substring(10));
		
		System.out.println(str.substring(3, 9));
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.concat(" Hello"));
		
		System.out.println(str.isEmpty());
		
		System.out.println(str.indexOf("d"));
		
		System.out.println(str.lastIndexOf("a"));
		
		System.out.println(str.replace("a", "b"));
		
		
		

	}

}
