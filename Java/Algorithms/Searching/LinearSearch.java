//Linear Search Alogarithm
package Learn;

public class LinearSearch {
    private int x ;
    private int arr[];
    private int xSort;

    LinearSearch(int arr[]){
        this.arr = arr;
    }
    
    public boolean Search(int x){
        this.x = x;
        boolean find = false;
        for(int b = 0 ; b < arr.length ; b++){
            if(this.x == arr[b]){
               find = false;
               xSort = b;
               break;
            }
            else{
                find = true;
            }
        }
        if(find){
            //return true if index in array
            return true;
        }
        else{
            //return false if index not in array
            return false;
        }  
    }
}
