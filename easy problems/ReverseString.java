class Solution {
    public void reverseString(char[] s) {
       char[] e = new char[s.length];
       int i=0,j=s.length-1;
       while(j>=0){
        e[i++]=s[j--];
       }
       for(int k=0;k<s.length;k++)
        s[k]=e[k];
        System.out.print(s);
    }
    
}
