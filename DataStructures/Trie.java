package DataStructuresAndAlgorithms.DataStructures;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AmrDeveloper
 */
public class Trie {

    class Node {
        public Map<Character, Node> children;
        public boolean isCompleteWord;

        public Node() {
            this.children = new HashMap();
            this.isCompleteWord = false;
        }
    }

    private final Node root;

    public Trie() {
        root = new Node();
    }

    /**
     * Insert Word in Trie Data Data Structures
     * @param word 
     */
    public void insert(String word) {
         Node currentNode = root;
         for(int i = 0 ; i < word.length() ; i++){
             char currentChar = word.charAt(i);
             //Check if this Character in map or not
             Node node = currentNode.children.get(currentChar);
             //If character is not in map add it
             if(node == null){
                 node = new Node();
                 currentNode.children.put(currentChar, node);
             }
             currentNode = node;
         }
         currentNode.isCompleteWord = true;
    }
    
    /**
     * @param word : search if this word is on map or not
     * @return 
     */
    public boolean search(String word){
        //Make Current node is root 
        Node currentNode = root;
        //get characters char by char
        for(int i = 0 ; i < word.length() ; i++){
            //Get current characters
            char currentChar = word.charAt(i);
            //check if this characters is on map
            Node node = currentNode.children.get(currentChar);
            //if it not in map that mean the word in not in map
            if(node == null){
                return false;
            }
            //if char is on map go to check next char
            currentNode = node;
        }
        //in the end check if last character is end of word or not
        return currentNode.isCompleteWord;
    } 
}