class Solution {
    public int strStr(String haystack, String needle) {
        int needle_size = needle.length();
        int haystack_size= haystack.length();
        
        int count=0,counts=0,u=0;
        ArrayList<Integer>index = new ArrayList<>();
        for(int i=0; i<=haystack.length()-needle_size;i++){
            String substring = haystack.substring(i, i+needle_size);
            if(substring.equals(needle)){
                index.add(i);
                counts++;
            }
        }
        Integer[] array = index.toArray(new Integer[0]);
        Arrays.sort(array);
        //System.out.print(index[0]);
        if(counts==0)
            u= -1;
        else if(counts>0)
            u= array[0];
        else
            u=-1;

        return u;
    }
}
