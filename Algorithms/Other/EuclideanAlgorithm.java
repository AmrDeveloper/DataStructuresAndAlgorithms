package DataStructuresAndAlgorithms.Algorithms.Other;

/**
 * @author AmrDeveloper Euclidean Algorithm help to find the (GCD) greatest
 * common divisor of the two Integers
 */
public class EuclideanAlgorithm {

    public static int findGreatestCommonDivisor(int number1, int number2) {
        while (number1 != 0 && number2 != 0) {
            int remainder = number1 % number2;
            number1 = number2;
            remainder = number2;
        }
        return number1;
    }
}
