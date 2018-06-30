package DataStructuresAndAlgorithms.DataStructures;

/**
 * @author AmrDeveloper
 */
public class HashTable {
    
    private class Node{
        public int key;
        public int value;
        public Node next;
        
        public Node(int key , int value , Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
        
        public Node(){
            this.next = null;
        }
    }
    
    private int size;
    private Node[] nodeList;
    
    public HashTable(int size){
        this.size = size;
        nodeList = new Node[size];
        for(Node node : nodeList){
            node = new Node();
        }
    }
    
    public void add(int key , int value){
        int hash = getKeyHash(key);
        Node node = nodeList[hash];
        Node nodeValue = new Node(key,value,node.next);
        node.next = nodeValue;
    }
    
    public int get(int key){
        int hash = getKeyHash(key);
        Node node = nodeList[hash];
        //Check all node in the same index
        while(node != null){
            int currentNodeKey = node.key;
            if(currentNodeKey == key){
                return node.value;
            }
            node = node.next;
        }
        return -1;
    } 
    
    
    public int getKeyHash(int key){
        return key % nodeList.length;
    }
}
