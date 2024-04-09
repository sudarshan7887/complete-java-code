package Array;

public class ArrayDemo {

	public static void main(String[] args)
	{
		int [] arr = {10,23,45,54,34,12,34,54,98,76};
		
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		//for-each loop
		
		System.out.println("print array using for each loop:");
		for(int i: arr)
		{
			System.out.print(i +",");
		}
	}

}
