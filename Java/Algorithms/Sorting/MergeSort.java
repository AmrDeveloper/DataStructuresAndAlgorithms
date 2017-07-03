//Merge Sorting
package Learn;

//AmrDeveloper

public class MergeSort {
    //Main Array
    public int Array[];
    public int TempArray[];

    
    public void MergeSorting(int arr[]){
        this.Array = arr;
        this.TempArray = new int[arr.length];
        DivSmall(0,arr.length - 1);
    }
    
    private void DivSmall(int LowIndex , int HighIndex){
        if(LowIndex < HighIndex){
           int mid = LowIndex + ( HighIndex - LowIndex ) /2;
           DivSmall(LowIndex , mid);
           DivSmall(mid+1 , HighIndex);
           MergePart(LowIndex , mid , HighIndex);
        }   
    } 
    private void MergePart(int LowIndex ,int mid, int HighIndex){
        for(int i = LowIndex ; i <= HighIndex ; i++){
            TempArray[i] = Array[i];
        }
        int i =  LowIndex;
        int j = mid + 1;
        int k =  LowIndex;
        while(i <= mid && j <= HighIndex){
            if(TempArray[i] <= TempArray[j]){
                Array[k] = TempArray[i];
                i++;
            }
            else{
                Array[k] = TempArray[j];
                j++; 
            }
            k++;
        }
        while(i <= mid){
            Array[k] = TempArray[i];
                i++;
                k++;
        }
    }
    
}
