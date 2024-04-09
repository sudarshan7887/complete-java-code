import java.util.Scanner;

class Swapwith2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to swap:");
       int a = sc.nextInt();
       int b = sc.nextInt();

       System.out.println("Before Swapping:" + a + "," + b);
       //Swap
       a = a + b;
       b = a - b;
       a = a - b;

       System.out.println("After Swapping:" + a + "," + b);

    }
}