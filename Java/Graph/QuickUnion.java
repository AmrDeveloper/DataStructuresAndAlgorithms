
package Algorithms;


public class QuickUnion {
    
    //number of object in array
    private int n;
    //array of id
    private int [] id;
    
    QuickUnion(int n){
        this.n = n;
        this.id = new int[n];
        //set of each object to itsself
        for(int i = 0 ; i < n ; i++){
            id[i] = i;
        }
    }
    
    //find the root 
    //root if id[x] = x
    private int root(int i){
        //find i root
        while(id[i] != i){
            i = id[i];
        }
        return i;
    }
    
    //find we will search untill find the root and 
    //save the biggest number
    public int find(int i){
     int x = 0;
     while(id[i] != i){
         if(x > i)
            x = i;
         i = id[i];
     }
     return x;
    }
    
    //p equal q if have same root
    public boolean isConnected(int p , int q){
        return root(p) == root(q);
    }
    
    //connecte with the root 
    //and just change one index not all with same value like Quick find
    public void union(int p , int q){
        int rp = root(p);
        int rq = root(q);
        id[rp] = rq;
    }
    
}
