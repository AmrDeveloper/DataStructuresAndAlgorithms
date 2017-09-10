//Euclidean Algorithm is simple and good algorithm 
//this algorithm used for get  the greatest common divisor of the two ints (gcd)
package Algorithms;



public class EuclideanAlgorithm {
    
    
    //Find gcd
    public int find(int x , int y){
        //while x and y are not zero
        while((x != 0) && (y != 0)){
            //find the remainder of x divided by y
            int remainder = x % y;
            //set x to y
            x = y;
            //set b to the remainder 
            y = remainder;
        }
        return x;
    }
    
    
}
