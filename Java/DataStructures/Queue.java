//Queue In java USe FIFO - First In First Out

package Learn;

//Develop By AmrHesham
public class Queue {
    private int size;
    private Object Queue[];
    
    private int Rear;//Move When We Add 
    private int Front;
    
    Queue(int size){
        this.size = size;
        Queue = new Object[size];
        Rear = -1;
        Front = -1;
    }
    private Boolean IsFull(){
        return (Rear == size);
    }
    private Boolean IsEmpty(){
        return (Rear == -1);
    }
    public void Push(Object item){
        if(IsFull()){
            System.out.println("Sorry Bro Queue Is Full");
        }
        else{
        Rear = Rear + 1 ;
        Queue[Rear] = item;
        }
    }
    public Object Pop(){
        if(IsEmpty() | Front == Rear){
            System.out.println("Sorry Bro Your Queue Is Empty");
            return null;
        }
        else{
            Front = Front + 1;
            Object item = Queue[Front];
            return item;
        }
    }
    
}
