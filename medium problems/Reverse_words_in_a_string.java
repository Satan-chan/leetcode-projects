class Solution {
    public String reverseWords(String s) {
           s = s.trim();
        String[] words = s.split("\\s+"); // Split by one or more spaces
        Stack<String> wort = new Stack<>();
        
        for (String word : words) {
            wort.push(word);
        }
        
        StringBuilder reversedSentence = new StringBuilder();
        
        while (!wort.isEmpty()) {
            reversedSentence.append(wort.pop());
            if (!wort.isEmpty()) {
                reversedSentence.append(" ");
            }
        }
        
        return reversedSentence.toString();
    }
}
