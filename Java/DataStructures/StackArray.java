//Stack Using Array In Java
//Stack Type Use LIFO -Last In First Out-
package Learn;

public class StackArray {
    
    
    public int size;
    public Object[] Stack;
    //Top Using For Pop First Item
    public int Top;
    
    
    StackArray(int size){
        //Create Array[size That User Choose It]
        this.size = size;
        Stack = new Object[size]; 
        //It -1 Beacuse be 0 will add first item
        Top = -1;
    }
    private Boolean IsFull(){
        return (Top == (size-1));
    }
    private Boolean IsEmpty(){
        return (Top == -1);
    }
    
    
    public void Push(Object item){
        if(IsFull()){
            System.out.println("Sorry Bro Stack Is Full");
        }
        else{
        //Top++ When Add Any Items    
        Top = Top + 1; 
        Stack[Top] = item;
        }
    }
    public Object Pop(){
        if(IsEmpty()){
            System.out.println("Sorry Bro Stack Is Empty");
            return null;
        }
        else{
        Object item = Stack[Top];
        Top = Top - 1;
        return item;
        }
    }
            
    
    
}
