public class MethodsProblem
 {

    //multiplication table
    public static void multiplication(int n)
    {
       for(int i=1;i<=10;i++)
       {
        System.out.format("%d * %d = %d\n", i,n, n * i);
       } 
    }

    //print pattern
    public static void pattern(int n1)
    {
        for (int i = 0; i < n1; i++)
         {
            for(int j=0 ; j<i+1 ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //first n natural number using recurssion

    public static int sumRec(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
            return n + sumRec(n-1);
        }
    }

    //pattern2

    public static void pattern2(int n)
    {
       for (int i = n; i > 0; i--)
         {
            for(int j=i-1 ; j > 0 ; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //fibonacci series

    public static int fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) 
    {
        //multiplication table
        System.out.println("multiplication table....");
        multiplication(10);

        //* pattern */
        System.out.println(" pattern....");
        pattern(5);

        //natural numbers
        int c =  sumRec(10);
        System.out.println("The sum of first 10 natural number is:"+c);


        //pattern 2
        pattern2(5);


        //fibonacci
        for (int i = 0; i < 10; i++)
         {
      
            System.out.print(fibonacci(i) + " ");
        }

    }
    
}
