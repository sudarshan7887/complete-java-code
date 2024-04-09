import java.util.Scanner;

class Fibo{
 public int show(int n)
 {
    if(n<0)
    {
        return 0;
    }
    else if(n==1)
    {
        return 1;
    }
    else
    {
        return show(n-1) + show(n - 2) ;
    }
 }
}

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Fibo f = new Fibo();
         for(int i = 0;i<=n;i++)
         {
            System.out.print(f.show(i)+" ");
         }
    }
    
}
