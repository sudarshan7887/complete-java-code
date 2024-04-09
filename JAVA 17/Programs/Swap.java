import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers to swap");
        int a = sc.nextInt();
        int b = sc.nextInt();

        

        System.out.println("Swap using 3rd variable:");
        System.out.println("Before Swapping:" +a +":" + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:" + a + ":" + b);
        System.out.println();

        System.out.println("Swap using without 3rd variable:");
        System.out.println("Before Swapping:" +a +":" + b);
        a = a + b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping : "+a + ":" + b);



    }
    
}
