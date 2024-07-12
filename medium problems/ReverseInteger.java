class Solution {
    public int reverse(int x) {
        int reversedNumber = 0;

        while (x != 0) {
            int digit = x % 10;

           
            if (reversedNumber > Integer.MAX_VALUE / 10 || (reversedNumber == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; 
            }

            if (reversedNumber < Integer.MIN_VALUE / 10 || (reversedNumber == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; 
            }

            reversedNumber = reversedNumber * 10 + digit;
            x /= 10;
        }

        return reversedNumber;
    }
}
