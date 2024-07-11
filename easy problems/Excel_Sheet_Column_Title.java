class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();
        while ( columnNumber > 0) {
             columnNumber--; 
            int remainder = columnNumber % 26;
            char letter = (char) (remainder + 'A');
            columnTitle.insert(0, letter);
            columnNumber = columnNumber/ 26;
        }
        return columnTitle.toString();
    }
}
