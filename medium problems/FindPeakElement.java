class Solution {
    public int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        max= Math.max(nums[i],max);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max)
                return i;
        }
        return -1;
        
    }
}
