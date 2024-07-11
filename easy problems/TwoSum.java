class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] res = new int[2];
        for(int i=0;i<size-1;i++){
           int temp = nums[i];
                if(temp+nums[i+1]==target){
                    res[0]=i;
                    res[1]=i+1;
                }
 
        }
        return res;
    }
}
