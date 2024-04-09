package Array;

public class DesendingOrder {

	public static void main(String[] args) 
	{
		int[] arr = {12,32,56,43,4,56,32,45,67,65,43,8};
		int temp = 0;
		
		for(int i = arr.length-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]< arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+ " ");
		}
		

	}

}
