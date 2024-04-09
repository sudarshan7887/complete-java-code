package Array;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		int[] arr = {1,2,4,3,5,6,7};
		
		for(int i = 0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}

}
