
package Algorithms;

import java.util.Arrays;


public class QuickFind {
    //QuickFind algorithm to make dynamic connectivity
    //initialize take n time
    //union take n time
    //find take 1 time because it array
    //take n ^ 2 to accesses to process sequence of n union commands on n objects
    //int n is number of object
    private int n;
    //array of id
    //p and q are connected if they have the same id
    private int id[];
    
    //Constructor
    QuickFind(int n){
        this.n = n;
        //n is size of id
        this.id = new int[n];
        //set of each object to itsself
        for(int i = 0 ; i < n ; i++){
            id[i] = i;  
        }
    }
    
    //connect p with q
    public void union(int p , int q){
        int pid = id[p];
        int qid = id[q];
        //in id array change every id with value id[p] to value id[q]
        for(int i = 0 ; i < n ; i++){
            if(id[i] == pid)
                id[i] = qid;
        }
    }
    
    //in id array if id[p] equal id[q] than mean true
    //and p connect with q
    //else mean not connected
    public boolean isConnected(int p , int q){
        return (id[p] == id[q]);
    }
    
   
    
}
