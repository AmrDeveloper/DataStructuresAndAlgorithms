package DataStructuresAndAlgorithms.Graph;

/**
 * @author AmrDeveloper
 */
public class WeightedQuickUnion {
    //Weighted Quick Union is like Quick Union 
    //but connect root with small tree size under root with big tree size
    //number of object
    private int n;
    //array of object
    private int id[];
    //size of every root
    //with this array we can know any root tree size
    private int size[];
    
    public WeightedQuickUnion(int n){
        this.n = n;
        this.id = new int[n];
        //set of each object to itsself
        for(int i = 0 ; i < n ; i++){
            id[i] = i;
            //all start with 1 size as defult
            size[i] = 1;
        } 
        this.size = new int[n];
    }
    
    private int root(int i){
        //if id[i] not equal i that mean this is not root
        while(id[i] != i){
            i = id[i];
        }   
        return i;
    }
    
    //is Connected if p.root is equal q.root
    public boolean isConnected(int p , int q){
        return (root(p) == root(q));
    }
    
    
    //connect root of p with root of q
    //take log n time not n like Quickfind and quickUnion
    public void union(int p , int q){
        //root of p
        int rp = root(p);
        //root of q
        int rq = root(q);
        //if root of q == root of p that mean is connected so return
        if(rp == rq){
            return;
        }
        //if size of rq tree bigger than size of rp three
        if(size[rp] < size[rq]){
            //connect
            id[rp] = rq;
            //add size of rp root to size of rq root
            size[rq] += size[rp];
        }
        //else mean size of rp tree bigger than size of rq three
        else{
            //connect
            id[rq] = rp;
            size[rp] += size[rq];
        }
    }
}