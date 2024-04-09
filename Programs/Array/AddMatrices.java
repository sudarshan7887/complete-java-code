package Array;

public class AddMatrices {

	public static void main(String[] args) {
		
		int arr1[][] = {
							{1,3,4},{2,4,3},{3,4,5} 
					   };
		int arr2[][] = {
							{1,3,4},{2,4,3},{1,2,4}
					   };
		
		int arr3[][] = new int[3][3];
		
		for(int i =0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
