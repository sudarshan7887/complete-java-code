package Strings;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		String str = "Sudarshan";
		String rev = "";
		
		for(int i =str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		//using StringBuffer
		
		StringBuffer bf = new StringBuffer(str);
		System.out.println(bf.reverse());

	}

}
