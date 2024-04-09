package Array;

public class OddOrderElement {

	public static void main(String[] args)
	{
		int [] arr = {12,32,44,55,67,87,89,44,55};
		
		for(int i =1;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}

	}

}
