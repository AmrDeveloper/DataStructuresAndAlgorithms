/*
This Array Start With size = 0
When Add new Item first Check Capacity
if Item Index < Capacity then add item
if Capacity < Item Index Then Size = size +1
The Good in This Type Of Array Is low Size
in Dynamic Array if size = 1000 and add will be 2000
but in PlusArray Size will be 2001
but it take bit time and low size ~_~
*/
package Learn;

//This Array Developed By Amr Hesham Gaber
//Github/AmrDeveloper


import java.util.Arrays;


public class PlusArray {
    
    private int array[];
    private int size;
    
    PlusArray(){
        size = 0;
        array = new int[size];
    }
    private void CheackCapacity(int ItemIndex){
        //Current Capacity
        int OldCapacity = array.length;
        //if It Full
        if(ItemIndex > OldCapacity){
            //Capacity = Capacity + 1;
            int NewCapcity = OldCapacity + 1;
            
            if(NewCapcity < ItemIndex){
                NewCapcity = ItemIndex;
            }
            //Copy Array With new Capacity
            array = Arrays.copyOf(array, NewCapcity);   
        }
    }
    //To Add Item Will First Check Current Capacity
    public void AddItem(int Item){
        CheackCapacity(size + 1);
        array[size++] = Item;
    }
    //return Array[index]
    public int GetItem(int Index){
        return array[Index];    
    }
    
    
}
