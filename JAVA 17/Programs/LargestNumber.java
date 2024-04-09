import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int c = sc.nextInt();

        System.out.println("Larger number is:");
        if(a > b && a>c)
        {
            System.out.println(a);
        }
        else if(b>c && b>a)
        {
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
         

    }
    
}
