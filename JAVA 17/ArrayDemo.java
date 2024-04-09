public class ArrayDemo {
    public static void main(String[] args) {
        
       // int [] arr ={34,56,97,89,86,35,67};
            // for(int element :arr)
            // {
            //     System.out.println(element);
            // }

            //reverse Array
            /* 
                for(int i=arr.length-1;i>=0;i--)
                {
                    System.out.println(arr[i]);
                }

            */

            //or ------->resverse Array
            /*
            int l = arr.length;
            int n = Math.floorDiv(l, 2);
            int temp;

            for(int i=0;i<n;i++)
            {
                temp = arr[i];
                arr[i]= arr[l-i-1];
                arr[l-i-1]= temp;
            }

            for(int element : arr)
            {
                System.out.print(element +" ");
            }
            */

            //calculate sum of given Array
            /* 
                int sum = 0;
                for(int i = 0;i<arr.length;i++)
                {
                    sum = sum + arr[i];
                }
                System.out.println(sum);
            */

            //Average of given array
            /* 
             int sum = 0;
                for(int i = 0;i<arr.length;i++)
                {
                    sum = sum + arr[i];
                }
                System.out.println("Average is: "+sum/arr.length);
           */

           /*
           boolean result = false;
           int num = 89;
           for(int i=0;i<arr.length;i++)
           {
            if(num== arr[i])
            {
                result = true;
                break;
            }
           }

           if (result) {
            System.out.println("present in Array");
           } else {
            System.out.println("not present in Array");
           }

           */

           //Add two matrises

           /*
           int[][] arr1 = {
                            {3,4,5},
                            {6,7,8}
                          };
             int[][] arr2 = {
                            {1,2,3},
                            {9,1,2}
                          };

            int [][]result = {{0,0,0},{0,0,0}};
           

                // for(int i=0;i<arr1.length;i++)
                // {
                //     for(int j=0;j<arr1[i].length;j++)
                //     {
                //         System.out.format(" setting value for i=%d and j=%d \n",i,j);
                //         result[i][j]= arr1[i][j] + arr2[i][j];
                        
                //     }
                  
                // }

                for(int i=0;i<arr1.length;i++)
                {
                    for(int j=0;j<arr1[i].length;j++)
                    {
                        result[i][j]= arr1[i][j] + arr2[i][j];
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }

        */



       
         //int [] arr ={-188,34,56,97,89,86,35,67};

          // find maximum element in given Array
          /* 
         int max = 0;

         for(int element : arr)
         {
            if(element > max)
            {
               max = element;
               
            }
         }
            System.out.println("The value of maximum element is:"+max);
        */

             // find minimum element in given Array

             /* 
             int min = arr[0];
             for(int element : arr)
             {
                if(element < min)
                {
                    min = element;
                
                
             }
          }
             System.out.println("The minimum element is:" + min);

             */


             //Array is sorted or not
            // int [] arr ={34,56,97,89,86,35,67};
               int [] arr = {1,2,3,4,5,6};
             boolean isSorted = true;
             for(int i=0;i<arr.length-1;i++)
             {
               if(arr[i] > arr[i+1])
               {
                 isSorted = false;
               }
             }

             if(isSorted)
             {
                System.out.println("Array is Sorted");
             }
             else
              System.out.println("Array is not sorted");

        }
    }
    

