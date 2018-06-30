/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms.Algorithms.Searching;

/**
 *
 * @author AmrDeveloper
 */
public class LinearSearch {
    
    private LinearSearch(){}
    
    public int searchValue(int[] array , int value){
        int index = -1;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == value){
                return index;
            }
        }
        return index;
    }
}
