
package Learn;

public class HashTable <T>{
    public node Arr[];
    public int size;
    HashTable(int size){
       this.size = size;
       Arr = new node[this.size];
       for(int i = 0 ; i < Arr.length ; i++){
           Arr[i] = new node();
       }
    }
    public int getHash(int key){
        return key % Arr.length;
    }
    public void PutItem(int key , int value){
        int index = getHash(key);
        node ArrVal = Arr[index];
        node GetItem = new node(key,value,null);
        GetItem.next = ArrVal.next;
        ArrVal.next = GetItem;
    }
    public T GetItem(int key){
        T val  = null;
        int index = getHash(key);
        node ArrVal = Arr[index];
        while(ArrVal != null){
            if(ArrVal.getkey() == key){
                val = (T) ArrVal.value;
                break;
            }
            ArrVal = ArrVal.next;     
        }  
        return val;
    }  
   
    public class node<T>{
        public int key;
        public T value;
        public node next;
        node(int key ,T value , node next){
            this.key = key;
            this.value = value;
            this.next = null;
        }
        node(){
            this.next = null;
        }
        public int getkey(){
            return key;
        }
        public T getVal(){
            return (T)value;
        }
        
    }
    
}
