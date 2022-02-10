package DualPointer;

//https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/
//167. Two Sum II - Input Array Is Sorted

public class Q126 {

    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length <= 1) {
            return null;
        }


        return null;
    }

    public int[] twoSum2(int[] numbers, int target) {
        if (numbers == null || numbers.length <= 1) {
            return null;
        }
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int result = numbers[start] + numbers[end];
            if (result == target) {
                return new int[]{start + 1, end + 1};
            } else if (result > target){
                end--;
            } else {
                start++;
            }
        }

        return null;
    }
}
