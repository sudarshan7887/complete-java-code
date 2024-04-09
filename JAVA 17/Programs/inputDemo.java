import java.util.Scanner;

public class inputDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your integer values: ");
        int a = sc.nextInt();
         System.out.println("Enter your String values: ");
        String str = sc.next();
        //  System.out.println("Enter your float values: ");
        // float f = sc.nextFloat();
        System.out.println("Your values are:");
        System.out.println(a + " :" + str);

        float f = a;
        
        System.out.println(f);

        }
}
