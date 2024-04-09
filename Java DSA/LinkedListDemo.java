import java.util.*;

class LinkedListDemo
{
  public static void main(String args[])
  {
      LinkedList<String> list = new LinkedList<>();

      list.addFirst("a");           //add element in starting
      list.addFirst("is");
      System.out.println(list);

      list.addFirst("This");
      list.add("list");          //or list.addLast("list");   //add element in last index
      System.out.println(list);

      System.out.println(list.size());        //print list size

      list.removeFirst();           //delete first element
       System.out.println(list);

       list.removeLast();           //delete last element
       System.out.println(list);

      // list.remove(1);              //remove specific index element
      // System.out.println(list);        
  }
}




  //code implementation  ==>

// class LinkedListDemo{

//     private int size;

//     LL(){
//         this.size = 0;
//     }
//     Node head;
//     class Node{
//         String data;
//         Node next;
       

//         Node(String data){
//             this.data = data;
//             this.next = null;
//              size++;
//         }
//     }

//     //add first node

//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     //add last node
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next !=null){
//             currNode = currNode.next;
//         }

//         currNode.next = newNode;
//     }

//     //print list

//     public void printlist(){
//         if(head==null){
//             System.out.println("list is Empty");
//         }

//         Node currNode = head;
//         while(currNode.next !=null){
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }
//         System.out.println("NULL");
//     }


//     //delete first node

//     public void deleteFirst(){
//         if(head == null){
//             System.out.println("The list is Empty");
//             return;
//         }
//         size--;
//         head = head.next;
//     }

//     //delete last node

//     public void deleteLast(){
//         if(head ==null){
//             System.out.println("The list is Empty");
//             return;
//         }
//         size--;
//         if(head.next ==null){
//             head=null;
//             return;
//         }

//         Node secondLast = head;
//         Node lastNode = head.next;
//         while(lastNode.next !=null){
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }
//     }
//     public int getsize(){
//         return size;
//     }

//     public static void main(String args[])
//     {
//         LL list = new LL();
//         list.addFirst("a");
//         list.addFirst("is");
//         // list.printlist();
//         list.addLast("list");
//         list.addLast("a");

//         list.addFirst("This");
//         list.printlist();

//         list.deleteFirst();
//         list.printlist();

//         System.out.println(list.getsize());

      
//     }
// }