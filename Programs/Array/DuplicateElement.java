package Array;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int arr[] = {12,32,44,55,67,87,89,44,55};
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i] + ",");
				}
			}
		}

	}

}
