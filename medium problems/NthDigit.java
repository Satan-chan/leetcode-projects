class Solution {
    public int findNthDigit(int n) {
        
        // Start with 1-digit numbers
        int digitLength = 1;
        long count = 9; // There are 9 single-digit numbers
        
        // Determine the range that contains the nth digit
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
        }
        
        // Determine the actual number that contains the nth digit
        long start = (long)Math.pow(10, digitLength - 1);
        long number = start + (n - 1) / digitLength;
        
        // Determine the exact digit in the number
        String s = Long.toString(number);
        return Character.getNumericValue(s.charAt((n - 1) % digitLength));

    }
}
