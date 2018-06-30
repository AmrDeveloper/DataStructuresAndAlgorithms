/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms.Algorithms.Sorting;

import java.util.Arrays;

/**
 *
 * @author AmrDeveloper
 */
public class CounterSort {
    
    private int index;
    private int biggest;
    private int[] newArray;
    private int[] nativeArray;
    
    public CounterSort(int[] nativeArray , int biggest){
        this.nativeArray = nativeArray;
        this.biggest = biggest;
        
        this.newArray = new int[biggest + 1];
    }
    
    public void sorting(){
        for(int value : nativeArray){
            newArray[value]++;
        }
        
        this.index = 0;
        
        for(int i = 0 ; i < newArray.length ; i++){
            while(newArray[i] > 0){
                nativeArray[index++] = i;
                newArray[i]--;
            }
        }
    }  
}
