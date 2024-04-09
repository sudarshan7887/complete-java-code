import java.util.*;
public class revLinkedList
{
    public static void main(String args[]){

     LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(0);
        list.add(2);
        list.add(20);
        list.add(15);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        
        Collections.reverse(list);        
        System.out.println(list);

    }

}