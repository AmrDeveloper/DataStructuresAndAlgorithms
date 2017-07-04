
package amrpro;

public class LinkList {
    //The Node Type on Java 
   public static class Node{
       public int Val;
       public Node next;
       //Constructor of Node
       Node(int val ,Node next){
           this.Val = val;
           this.next = next;
       }
   }
  
   //Constructor of LinkList
   //Head Is The First Node
   Node Head;
   LinkList(Node Head){
       this.Head = Head;
       }
  public void Add(Node newNode){
      //NewNode val | Next ---> Head Val | Null
      //It Like Exchange^_^
      newNode.next = Head;
      Head = newNode;  
  }
  public void Delete(){
      //Head == The Next Node && Read Head Gone
      Head = Head.next;
  }
  public void DisPlayNods(){
      Node N = Head;
      while(N != null){
       System.out.println(N.Val);   
       N = N.next;
      }
  }
  
  
}
