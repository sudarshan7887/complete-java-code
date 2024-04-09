

public class RecurrsionDemo
 {
    //fibonacci series

    public static int fibonacci(int count)
    {
        if(count<1)
        {  
           return 0; 
        }
        else if(count==1)
        {
            return 1;
        }
        else{
        return fibonacci(count-1) + fibonacci(count-2);
        }
    }


    //factorial
    public static int factorial(int n)
    {
       if(n==1|| n==0)
       {
        return 1;
       }
       else
       {
        return n * factorial(n-1);
       }
    }
    public static void main(String[] args)
     {

        // fibonacci series
        System.out.println("Fibonacci Series...");
          for(int i =0;i<=10;i++)
          {
            System.out.print(fibonacci(i)+ " ");
          }
           

        //factorial
        System.out.println();
        System.out.println("----------**********-------------");
        System.out.println("factorial....");
        System.out.println("factorial of 5 is:"+factorial(5));
    }
    
}
