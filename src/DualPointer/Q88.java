package DualPointer;

//https://leetcode-cn.com/problems/merge-sorted-array/description/
//88. Merge Sorted Array

public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstIndex = m - 1;
        int mergeIndex = m + n - 1;
        int secondIndex = n - 1;
        while (secondIndex >= 0 && mergeIndex >=0 ) {
            if (firstIndex < 0) {
                nums1[mergeIndex] = nums2[secondIndex--];
            }
            else if (nums1[firstIndex] <= nums2[secondIndex]) {
                nums1[mergeIndex] = nums2[secondIndex--];
            } else {
                nums1[mergeIndex] = nums1[firstIndex--];
            }
            mergeIndex--;
        }
    }
}