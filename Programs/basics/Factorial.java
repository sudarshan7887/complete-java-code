import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        int fact = 1;
        int n = 5;
        if(n == 0)
        {
            System.out.println("1");
        }

        else{
            for(int i=1;i<=n;i++)
            {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}

