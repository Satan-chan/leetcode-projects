import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
       BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        
        
        BigInteger result = number1.multiply(number2);
        return result.toString();
    }
}
