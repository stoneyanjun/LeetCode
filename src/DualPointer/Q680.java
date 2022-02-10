package DualPointer;

public class Q680 {
//    public boolean validPalindrome(String s) {
//        boolean deleted = false;
//        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
//            if (s.charAt(i) != s.charAt(j)) {
//                if (!deleted) {
//                    deleted = true;
//                    return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
//                } else {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        if (s == null || s.length() <= 2) {
            return true;
        }

        boolean deleted = false;
        char[] result = s.toCharArray();
        int lower = 0;
        int upper = result.length - 1;
        while (lower < upper) {
            if (result[lower] != result[upper]) {
                return isPalindrome(s, lower, upper - 1) || isPalindrome(s, lower + 1, upper);
            }
            lower++;
            upper--;
        }

        return true;
    }
}