import java.util.Arrays;
import java.util.Comparator;
class ArrayClass{
    public static void main(String[] args) {
        
        Integer[] arr = {12,32,12,11,34,56,78,87,23};
        Arrays.sort(arr,Comparator.reverseOrder());

        for(int i : arr)
        {
            System.out.print(i +" ");
        }
    }
}