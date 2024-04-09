package Array;

public class ThirdLargestEle {

	public static void main(String[] args) 
	{
		int temp;
		int arr[] = {1,2,34,5,6,7};
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<i;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The 3rd smallest element is:" +arr[arr.length-3]);

		//second smallest element
		System.out.println("The 2nd smallest element is:" +arr[arr.length-2]);


	}

}

