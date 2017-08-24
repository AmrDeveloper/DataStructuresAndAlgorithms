//The Right Node Is always Bigger Than The Main 
//The Left Node Is always Smaller Than The Main
//In Binary Tree Remember Parent Only Have 2 child
package Graph;


public class BinaryTree {
    //This Is The Main Node -First Father ^_^- 
     SingleNode Root; 
    //Constactor
    BinaryTree(SingleNode Root){
        this.Root = Root;
    }
    public void AddNode(SingleNode NewNode ,SingleNode ExplorNode){
        if(ExplorNode == null)
        {  
            //No Father ^_^
            return;
        }
        if(NewNode.value < ExplorNode.value)
        {
            if(ExplorNode.Left == null)
            {
                ExplorNode.Left = NewNode;
            }
            else
            { //Change Father By Child.left As Father And Searsh Again
            ExplorNode = ExplorNode.Left;
            AddNode(NewNode , ExplorNode);
            }
        }
        else if (NewNode.value > ExplorNode.value)
        {   
            //if no Right Son add new node
            if(ExplorNode.Right == null)
            {
               ExplorNode.Right = NewNode; 
            }
            else
            {
              //Change Father By Child.Right As Father And Searsh Again
              ExplorNode = ExplorNode.Right;
              AddNode(NewNode , ExplorNode);  
            }    
        }
    }
    
    public void Search(int value ,SingleNode ExplorNode){
        //Cant Find Value
         if(ExplorNode == null){
            System.out.println("Cant Find " + value);
            return;
        }
         //Find Value Done
        if(value == ExplorNode.value){
            System.out.println("Done Sir Your Val Is " + value);
            return;
        }   
        //Value Small Than Root So GO Left
        if(value < ExplorNode.value){
           Search(value , ExplorNode.Left); 
        }
        //Value Small Than Root So GO Right
        if(value > ExplorNode.value){
            Search(value , ExplorNode.Right);
        }
    }
  
}
