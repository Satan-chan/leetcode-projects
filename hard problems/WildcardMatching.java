class Solution {
    public boolean isMatch(String s, String p) {
        int sPointer = 0, pPointer = 0;
        int sStar = -1, pStar = -1;

        while (sPointer < s.length()) {
            if (pPointer < p.length() && (p.charAt(pPointer) == '?' || p.charAt(pPointer) == s.charAt(sPointer))) {
                sPointer++;
                pPointer++;
            } else if (pPointer < p.length() && p.charAt(pPointer) == '*') {
                sStar = sPointer;
                pStar = pPointer;
                pPointer++;
            } else if (pStar != -1) {
              
                sStar++;
                sPointer = sStar;
                pPointer = pStar + 1;
            } else {
                return false;
            }
        }

        while (pPointer < p.length() && p.charAt(pPointer) == '*') {
            pPointer++;
        }

        return pPointer == p.length();
    }
}
