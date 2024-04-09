import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {

        System.out.println("Assignment Operators:");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int a = sc.nextInt();

        System.out.println("Enter your second number:");
        int b = sc.nextInt();

        int Add = a + b;
        float Substraction = a - b;
        int multiplication = a * b;
        float division = a / b;
        a--;
        b--;

        System.out.println("Addition is: " + Add +"\nSubstraction is:" + Substraction + "\ndivision is:" + division
                + "\nmultiplication is:" + multiplication);
                System.out.println(a);
                System.out.println(b);

    }

}
