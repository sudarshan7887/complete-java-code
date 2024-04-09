import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo
{
    public static void main(String args[])
    {
      ArrayList<Integer> list = new ArrayList<>();

         //Add List
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(15);
        list.add(12);
        list.add(20);

        System.out.println(list);

        //get list

        int element = list.get(1);
        System.out.println(element);

        //add element between list

        list.add(1,1);
        System.out.println(list);

        //set element or change element

        list.set(0,5);
        System.out.println(list);

        //delete element from list

        list.remove(3);               //3 is index
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println(size);

        //sorting list in asending order

        Collections.sort(list);
        System.out.println(list);

         //sorting list in desending order

        Collections.reverse(list);
        System.out.println(list);

    }
}