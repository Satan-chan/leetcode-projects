class Solution {
    public boolean isAnagram(String s, String t) {
        final int[] dictionary = new int[26];

        for(int i = 0; i < s.length(); ++i)
            dictionary[s.charAt(i) - 'a']++;

        for(int i = 0; i < t.length(); ++i)
            dictionary[t.charAt(i) - 'a']--;

        for(int i = 0; i < dictionary.length; ++i)
            if(dictionary[i] != 0)
                return false;

        return true;
    }
}
