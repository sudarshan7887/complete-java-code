import java.util.Scanner;

class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first subject marks:");
        int a = sc.nextInt();

        System.out.println("Enter 2nd subject marks:");
        int b = sc.nextInt();

        System.out.println("Enter 3rd subject marks:");
        int c = sc.nextInt();

        System.out.println("Enter 4th subject marks:");
        int d = sc.nextInt();

        System.out.println("Enter 5th subject marks:");
        int e = sc.nextInt();

        float percentage = (a + b + c + d + e)/5;
        System.out.println(percentage);

    }
}