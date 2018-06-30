package DataStructuresAndAlgorithms.Graph;

/**
 * @author AmrDeveloper
 */
public class QuickFind {
    //QuickFind algorithm to make dynamic connectivity
    //initialize take n time
    //union take n time
    //find take 1 time because it array
    //take n ^ 2 to accesses to process sequence of n union commands on n objects
    //int n is number of object
    private int size;
    //array of id
    //p and q are connected if they have the same id
    private int idArray[];
    
    //Constructor
    public QuickFind(int size){
        this.size = size;
        //n is size of id
        this.idArray = new int[size];
        //set of each object to itsself
        for(int i = 0 ; i < size ; i++){
            idArray[i] = i;  
        }
    }
    
    //connect p with q
    public void union(int p , int q){
        int pId = idArray[p];
        int qId = idArray[q];
        //in id array change every id with value id[p] to value id[q]
        for(int i = 0 ; i < size ; i++){
            if(idArray[i] == pId)
                idArray[i] = qId;
        }
    }
    
    //in id array if id[p] equal id[q] than mean true
    //and p connect with q
    //else mean not connected
    public boolean isConnected(int p , int q){
        return (idArray[p] == idArray[q]);
    }
}
