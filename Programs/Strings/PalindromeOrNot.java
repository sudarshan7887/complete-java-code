package Strings;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		
		
		String str = sc.nextLine();
		
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
				rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev))
			{
				System.out.println("Palindrome");
			}
		
		else
			{
				System.out.println("Not Palindrome");
			}
		
	}

}
