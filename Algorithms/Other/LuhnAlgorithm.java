public class LuhnAlgorithm {

    /**
     * @param visaNumber : Visa Number as String
     * @return true if this visa number is valid
     */
    public static boolean isVisaNumberValid(String visaNumber){
        int oddNumber = 0;
        int evenNumber = 0;
        for(int i = 0 ; i < visaNumber.length() ; i++){
            //Even Index
            if(i%2 == 0){
                int currNumber = Integer.parseInt(String.valueOf(visaNumber.charAt(i)));
                currNumber = currNumber * 2;
                String currentString = String.valueOf(currNumber);
                for(int j = 0 ; j < currentString.length() ; j++){
                   evenNumber += Integer.parseInt(String.valueOf(currentString.charAt(j)));
                }
            }else{
                oddNumber += Integer.parseInt(String.valueOf(visaNumber.charAt(i)));
            }
        }
        return isSumValid(oddNumber + evenNumber);
    }


    /**
     * @param sum : if sum % 10 == 0 that mean visa number is valid
     * @return : true if visa number is valid
     */
    private static boolean isSumValid(int sum){
        return sum%10 == 0;
    }
}

