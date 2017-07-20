package ProgrammingSolving;

public class QuickSort {

    private void Swap(int arr [] , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void Sorting(int arr[] , int low , int high){
        if(low >= high)
            return;
        //middle index
        int middle = low + (high - low) / 2 ;
        //middle index
        int pivot = arr[middle];
        int i = low;
        int j = high;
        while(i <= j){
            //low ++ because it start from first index
            //It Stoping If arr[i] > pivot
            //that mean it bigger than pivot so shout use it to swap
            while(arr[i] < pivot){
                i++;
            }
            //high -- because it start from arr.length
            //It Stoping If arr[j] < pivot
            //that mean it lower than pivot so shout use it to swap
            while(arr[j] > pivot){
                j--;
            }
            //Compiler To use if It Muse End 2 While Loop
            //That Mean Find One number lower than pivot ont right
            //and one number bigger than pivot on tha left
            if(low <= j){
                //Swaping Two Index
                Swap(arr,i,j);
                //low ++ mean go to next index
                i++;
                //high -- mean go to last index
                j--;
            }
        }
        if(low < j){
           Sorting(arr,low,j);
        }
        if(high > i){
            Sorting(arr,i,high);
        }

    }
}
