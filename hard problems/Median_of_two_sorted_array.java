import java.util.Scanner;

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length;
        int size1 = nums2.length;
        int n = size + size1;
        int[] nums3 = new int[n];

        for (int i = 0; i < size; i++) {
            nums3[i] = nums1[i];
        }

        for (int j = 0; j < size1; j++) {
            nums3[size + j] = nums2[j];
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums3[j] > nums3[j + 1]) {
                    // Swap nums3[j] and nums3[j+1]
                    int temp = nums3[j];
                    nums3[j] = nums3[j + 1];
                    nums3[j + 1] = temp;
                }
            }
        }

        int midpoint = n / 2;

        if (n % 2 == 0) {
            double median = (nums3[midpoint] + nums3[midpoint - 1]) / 2.0;
            return median;
        } else {
            return nums3[midpoint];
        }
    }
}
