package DataStructuresAndAlgorithms.Algorithms.Other;

/**
 * @author AmrDeveloper
 * Kadane Algorithm to find The Biggest Sub array in Array
 * O(n) Complex time 
 */
public class KadaneAlgorithm {
    
    /**
     * @param nativeArray : The Full native array
     * @return : the sum of biggest sub Array in the nativeArray
     */
    public static int getBiggestSubArray(int[] nativeArray){
        int size = nativeArray.length;
        int bigSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for(int i = 0 ; i < size ; i++){
            //update subArray by add current element value
            currentSum = currentSum + nativeArray[i];
            
            //when Current SubArray bigger than the BigSum so update bigSUm
            if(currentSum > bigSum){
                bigSum = currentSum;
            }
            
            //when currentSum is negative make it zero
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return bigSum;
    }
    
}
