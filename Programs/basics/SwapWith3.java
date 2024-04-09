import java.util.Scanner;

public class SwapWith3 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to swap:");
       int a = sc.nextInt();
       int b = sc.nextInt();

       System.out.println("Before Swapping:" + a + "," + b);

       int temp = 0;
       temp = a;
       a = b;
       b = temp;

      System.out.println("After Swapping:" + a + "," + b);

    }
    
}
