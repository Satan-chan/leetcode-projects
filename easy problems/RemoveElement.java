class Solution {
    public int removeElement(int[] nums, int val) {
        int nonValIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // Move to the next non-matching element
                nums[nonValIndex] = nums[i];
                nonValIndex++;
            }
        }

        // The length of the modified array is nonValIndex
        return nonValIndex;
    }
}
