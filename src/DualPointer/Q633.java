package DualPointer;

// https://leetcode-cn.com/problems/sum-of-square-numbers/description/
// 633. Sum of Square Numbers

public class Q633 {
    public boolean judgeSquareSum(int c) {
        long sqrt = ((int) Math.sqrt(c));
        if (c == (sqrt * sqrt)) {
            return true;
        }
        long start = 1;
        long end = sqrt;
        while (start <= end) {
            long sum = start * start + end * end;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }
}