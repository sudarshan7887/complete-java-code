import java.util.Scanner;

class FactorialDemo{

    public double Factorial(double n)
    {
        if(n==0)
        {
            return 1;
        }
        else{
            return n * Factorial(n-1);
        }
    }
}

public class FactorialRec {
    public static void main(String[] args) {
        FactorialDemo f = new FactorialDemo();
        Scanner sc = new Scanner(System.in);
        double n1= sc.nextInt();
       double result = f.Factorial(n1);
       System.out.println("Factorial of "+n1+":" + result);

    }
    
}
