package Learn;

//This Array Start with 0 size
//when it Full size = size * 2;  (Double Size)
import java.util.Arrays;

public class DynamicArray <T>{
    int size = 0;
    Object Dynamic [];
    DynamicArray(){
        size = 0;
        Dynamic = new Object[size];
    }
    public int size(){
        return Dynamic.length;
    }

    //Empty All Items
    public void DeleteAll(){
        Object Dynamic[] = {};  
        this.size = 0;
    }
    
    public Object Getitem(int item){
        return Dynamic[item];
    }
    
    //Capacity == sizr of array
    private void CheckCapacity(int minCapacity){
        //Current Array Size 
        int oldCapacity = Dynamic.length; 
        //if new item numbers > Array Size
        if(minCapacity > oldCapacity){
            //Array new Size = Old Size * 2 ;
            int newCapacity = oldCapacity * 2 ;
            //if We Delete
            if(newCapacity < minCapacity)
                newCapacity = minCapacity;
            Dynamic = Arrays.copyOf(Dynamic, newCapacity);
        }
    }    
    public void AddItem(Object element){
        //Cheack if Size is good or need to double size
        CheckCapacity(size+1);
        //Add Item 
        Dynamic[size++] = element;
    }
    
}
