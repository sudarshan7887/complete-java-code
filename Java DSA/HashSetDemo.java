import java.util.HashSet;
import java.util.Iterator;
class HashSetDemo
{
    public static void main(String args[])
    {
        //set include only unique values
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);     //duplicate value

        System.out.println(set);

        //Size
        System.out.println("The size of given set is:" +set.size());

        //search - contains
        if(set.contains(1))
        {
            System.out.println("Set contains 1");
        }
        if(!set.contains(6))
        {
            System.out.println("Set does not contain");
        }
    

        //Delete
        set.remove(1);
            if(!set.contains(1))
            {
                System.out.println("does not contain");
            }

            System.out.println(set);


            // using iterator method
            System.out.println("using iterator method:");
            Iterator it = set.iterator();
            System.out.println(it.next());
    }
}
