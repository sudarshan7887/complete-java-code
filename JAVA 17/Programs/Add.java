import java.math.BigInteger;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers:");
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int result = a + b;
        // System.out.println("Addition is:" + result);


        //Big decimal

        System.out.println("Enter your big numbers:");
       String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        BigInteger first = new BigInteger(n1);
        BigInteger second = new BigInteger(n2);

        BigInteger bigresult = first.add(second);
        System.out.println("Result is:"+bigresult);

        }
    
}
