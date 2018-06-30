package DataStructuresAndAlgorithms.Graph;

/**
 * @author AmrDeveloper
 */
public class QuickUnion {

    //number of object in array
    private int size;
    //array of id
    private int[] idArray;

    QuickUnion(int size) {
        this.size = size;
        this.idArray = new int[size];
        //set of each object to itsself
        for (int i = 0; i < size; i++) {
            idArray[i] = i;
        }
    }

    //find the root 
    //root if id[x] = x
    private int root(int i) {
        //find i root
        while (idArray[i] != i) {
            i = idArray[i];
        }
        return i;
    }

    //find we will search untill find the root and 
    //save the biggest number
    public int find(int i) {
        int x = 0;
        while (idArray[i] != i) {
            if (x > i) {
                x = i;
            }
            i = idArray[i];
        }
        return x;
    }

    //p equal q if have same root
    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    //connecte with the root 
    //and just change one index not all with same value like Quick find
    public void union(int p, int q) {
        int pRoot = root(p);
        int qRoot = root(q);
        idArray[pRoot] = qRoot;
    }

}
