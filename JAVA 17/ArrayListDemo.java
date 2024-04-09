import java.util.*;

class ArrayListDemo{
    public static void main(String[] args) {
        

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(11);
        l1.add(82);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(66);

        l2.add(1);
        l2.add(2);
        l2.add(33);
        l2.add(2 , 10);
        System.out.println("Element of l2: "+l2);

    //      System.out.println("The size of l1: "+l1.size());
    //   // l1.retainAll(l2);            //common element
    //   System.out.println(" clone of l1:"+l1.clone());
    //   System.out.println(l1.get(5));
    //    System.out.println(l1.isEmpty());
    //    System.out.println(l1.subList(2 , 4));
    

       Collections.sort(l1);
       System.out.println(l1);


    }
}