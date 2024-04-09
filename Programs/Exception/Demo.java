import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        try 
        {
            int result = n1/n2;
            System.out.println("result is :"+result);

        }catch(Exception e)
        {
            System.out.println("Number cannot devide by 0 "+e);
        }
        

        finally{
            System.out.println("project terminated!");
        }
    }
}