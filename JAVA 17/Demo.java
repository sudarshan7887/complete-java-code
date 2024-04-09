// //factorial
//      class factorial{
//         int n =0;
//         public int printFactorial(int n)
//         {
//             if(n==0 || n==1)
//             {
//                 return 1;
//             }
//            return n * printFactorial(n-1);
//         }
          
//      }

//      //fibonacci series

//      class fibonacci{
        
//         public int printfibonacci(int n1){
//             if(n1 ==0)
//             {
//                 return 0;
//             }
//             else if(n1==1)
//             {
//                 return 1;
//             }
//             else
//             {
//                 return printfibonacci(n1-1) +printfibonacci(n1-2);
//             }
//         }
//      }

// public class Demo {
//     public static void main(String[] args) 
//     {
//         factorial fact = new factorial();
//        int result = fact.printFactorial(5);
//        System.out.println(result);

//     //fibonacci
//     fibonacci fb = new fibonacci();
//        for(int i =0;i<10;i++){
//            System.out.print(fb.printfibonacci(i) + " ");
//        }

//        System.out.println();
       
//      //Array


//      int [] arr = {2,4,6,8,10};
//      //arr[2] = 45;

//      //pint array
//     //  for(int i : arr){
       
//     //     System.out.print(i +" ");
//     //  }

//         //reverse Array
//         // for(int i=arr.length-1;i>=0;i--)
//         // {
//         //     System.out.println(arr[i]);
//         // }   

    
//         //average of arry

//         int sum = 0;
//         for(int i = 0;i<arr.length;i++)
//         {
//            sum = sum + arr[i];
//         }
//          System.out.println(sum/arr.length);

//     }

   
// }




//String

class Demo{
    public static void main(String[] args) {
        String str = "Hello";
       System.out.println(str.concat(" world"));
       System.out.println(str.substring(1,4));
       System.out.println(str.lastIndexOf("l"));
       System.out.println(str.charAt(1));
       System.out.println(str.isEmpty());
       System.out.println(str.repeat(5));
    }
}

