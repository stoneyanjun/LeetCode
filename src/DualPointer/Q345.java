package DualPointer;

import java.util.Arrays;
import java.util.HashSet;

public class Q345 {
//    private final HashSet<Character> vowels = new HashSet<>(
//            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
//        );
//
//    public String reverseVowels1(String s) {
//        if (s == null || s.length() <=1) {
//            return s;
//        }
//        int lower = 0, upper = s.length() - 1;
//        char[] result = s.toCharArray();
//
//        while (lower <= upper) {
//            char lowChar = s.charAt(lower);
//            char upperChar = s.charAt(upper);
//
//            if (!vowels.contains(lowChar)) {
//                lower++;
//            } else if (!vowels.contains(upperChar)) {
//                upper--;
//            } else {
//                result[upper--] = lowChar;
//                result[lower++] = upperChar;
//            }
//        }
//
//        return new String(result);
//    }
//
//    public String reverseVowels2(String s) {
//        if (s == null || s.length() <=1) {
//            return s;
//        }
//        int lower = 0, upper = s.length() - 1;
//        char[] result = new char[s.length()];
//
//        while (lower <= upper) {
//            char lowChar = s.charAt(lower);
//            char upperChar = s.charAt(upper);
//
//            if (vowels.contains(lowChar) && vowels.contains(upperChar)) {
//                result[upper--] = lowChar;
//                result[lower++] = upperChar;
//            } else if (vowels.contains(lowChar)) {
//                result[upper--] = upperChar;
//            } else if (vowels.contains(upperChar)) {
//                result[lower++] = lowChar;
//            } else {
//                result[lower++] = lowChar;
//                result[upper--] = upperChar;
//            }
//        }
//
//        return new String(result);
//    }

    static boolean[] hash = new boolean[128];
    static char[] vowels = new char[]{'a','e','i','o','u'};
    static {
        for (char c : vowels) {
            hash[c - ' '] = hash[Character.toUpperCase(c) - ' '] = true;
        }
    }
    public String reverseVowels(String s) {
        char[] cs = s.toCharArray();
        int n = s.length();
        int l = 0, r = n - 1;
        while (l < r) {
            if (hash[cs[l] - ' '] && hash[cs[r] - ' ']) {
                swap(cs, l++, r--);
            } else {
                if (!hash[cs[l] - ' ']) l++;
                if (!hash[cs[r] - ' ']) r--;
            }
        }
        return String.valueOf(cs);
    }
    void swap(char[] cs, int l, int r) {
        char c = cs[l];
        cs[l] = cs[r];
        cs[r] = c;
    }
}