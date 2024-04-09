import java.util.*;
class StackQue
{
    //push at the bottom of Stack
        public static void pushAtBottom(int data,Stack<Integer> s)
        {
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottom(data, s);
            s.push(top);
        }


        //Reverse a Stack
        public static void reverse(Stack<Integer> s)
        {
            if(s.isEmpty()){
                return;
            }
            int top = s.pop();
            reverse(s);
            pushAtBottom(top, s);

        }

     public static void main(String args[])
    {
        
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
       // pushAtBottom(4, s);               //pushAtBottom call
       
       reverse(s);                          //reverse function calling

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
           
           
        }
    }
}