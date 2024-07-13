class Solution {
    public static int firstMissingPositive(int[] nums) {
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            int currElem = nums[i];
            if (currElem == 1) found = true;
            if (nums[i] <= 0 || nums[i] > nums.length) nums[i] = 1;
        }
        if (!found) return 1;
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) > 0) {
                int idx = Math.abs(nums[i]) - 1;
                if (nums[idx] > 0) nums[idx] *= -1;
            }
        }
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] > 0) return i + 1;
        }
        return i + 1;
    }

}
