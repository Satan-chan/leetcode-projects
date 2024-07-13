class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0; // If there are less than 2 elements, there can't be any gap
        }
        
        Arrays.sort(nums); // Sort the array
        
        int maxGap = 0;
        
        // Iterate through the array to find the maximum difference between adjacent elements
        for (int i = 1; i < nums.length; i++) {
            int gap = nums[i] - nums[i - 1];
            maxGap = Math.max(maxGap, gap);
        }
        
        return maxGap;
    }
}
