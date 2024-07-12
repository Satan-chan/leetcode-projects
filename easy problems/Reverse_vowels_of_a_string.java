class Solution {
    public String reverseVowels(String s) {
        char[] array = new char[s.length()];
        for(int i=0;i<s.length();i++)
            array[i]= s.charAt(i);
        Stack<Character> mychar = new Stack<>();
        for(int i=0;i<array.length;i++){
            if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u')
                mychar.push(array[i]);
            else if(array[i]=='A'||array[i]=='E'||array[i]=='I'||array[i]=='O'||array[i]=='U')
                mychar.push(array[i]);
        }
        for(int i=0;i<array.length;i++){
            if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u')
                 array[i]=mychar.pop();
            else if(array[i]=='A'||array[i]=='E'||array[i]=='I'||array[i]=='O'||array[i]=='U')
                 array[i]=mychar.pop();
        }
        String reversal = new String(array);
        return reversal;
    }
}
