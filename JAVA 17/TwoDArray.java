class TwoDArray
{
    public static void main(String[] args) {
        int [][]arr1 = {{12,3,45,67,86,34},{3,45,5678,456,8}};
        
        for(int[]element : arr1)
        {
            for(int element1 : element)
            {
                System.out.print(element1 +" ");
            }
            System.out.println();
        }
    }
}