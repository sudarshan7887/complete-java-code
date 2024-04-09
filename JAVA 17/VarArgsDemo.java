class VarArgsDemo
{
   //public static int sum(int ...arr)
   public static int sum(int x,int ...arr)      //means at least 1 argument pass

    {
        // int result = 0;
        int result = x;
        for(int a : arr)
        {
            result +=a;

        }
        return result;
    }
    public static void main(String[] args) {
    //    System.out.println("sum of nothing is:"+sum());         //error throw
        System.out.println("sum of 3 numbers is:"+sum(1,2,3));
        System.out.println("sum of 4 numbers is:"+sum(12,34,56,1));
    }
}