public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12,35,55,34,65,88};

        // for(int i : arr)
        // {
        //     System.out.print(i +" ");
        // }

        
        //reverse Array
        for(int j =arr.length-1 ;j>=0;j--)
        {
            System.out.print(arr[j] + " ");
        }
    }
    
}
