class Solution {
    public void moveZeroes(int[] nums) {
       int n = nums.length;
        int index = 0; // Index to place the next non-zero element
        
        // Move non-zero elements to the front of the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        
        // Fill the rest of the array with zeros
        while (index < n) {
            nums[index++] = 0;
        }
    }
}
