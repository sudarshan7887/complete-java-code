import java.util.Collection;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(1);
        l1.add(3);
        l1.push(23);
        //l1.pop();
        l1.peek();
        System.out.println(l1);
        System.out.println(l1.get(1));  
        System.out.println(l1.size());
        
    }
    
}
