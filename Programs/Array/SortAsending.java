package Array;

public class SortAsending {

	public static void main(String[] args) {
		int temp = 0;
		int[] arr = {12,32,43,45,12,4,35,8};
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j =0;j<i;j++)
			{
				if(arr[i] < arr[j]) {
				temp=arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{

			System.out.println(arr[i]);
		}

	}

}
