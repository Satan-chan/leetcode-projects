class Solution {
    public static String reverseString(String str) {
  return new StringBuilder(str).reverse().toString();
}

    public static boolean isPalindrome(int n) {
        if(n<0) return false;
        else {
        String num = Double.toString(n);
        String rev = reverseString(num);
        double r= n;
        double number = Double.parseDouble(rev);
        return r==number;
        }
    }
 
}
