
package Learn;

public class NodeDouble {
    //Double Node
   public static class DNode{
       public int Val;
       public DNode next;
       public DNode Prevous;
       //Constructor of DoubleNode
       DNode(int val ,DNode next,DNode prevous){
           this.Val = val;
           this.next = next;
           this.Prevous = prevous;
       }
   }
    //Constructor of NodeDouble
   private DNode Rear;
   private DNode Front;
   private static int DoubleNodeSize = 0;
   
   NodeDouble(DNode NewNode){
       this.Rear = NewNode;//The Node Now , And The First Node When We Start
       this.Front = NewNode;//The Last Node
   }
   //Double Node Codes
   //Move The Real Head , Then New Node Be The new Head
   public void Add(DNode nNode){
       DoubleNodeSize++;//Size = Size + 1;
       nNode.next = null;//The Last Node ,So no Next
       nNode.Prevous = Rear;
       Rear.next = nNode;
       Rear = nNode;
    }
   public int Delete(){
       if(DoubleNodeSize == 0){
           System.out.println("Sorry NodeDouble Is Empty");
           return DoubleNodeSize;
       }
       else{
       DoubleNodeSize--;//Size = Size - 1 ;
       int Value = Front.Val;
       Front = Front.next;//Item TO The Next Item
       Front.Prevous = null;//The Last Item Delete Now
       return Value;
       }
   }
   //Empty All Double Node
   public void EmptyAll(){
       this.Rear.Prevous = null;
       this.Rear.next = null;
       this.Front.Prevous = null;
       this.Front.next = null;
       DoubleNodeSize = 0;
   }
   //Show Double Node Size
   public int DisPlaySize(){
       return DoubleNodeSize;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
   

