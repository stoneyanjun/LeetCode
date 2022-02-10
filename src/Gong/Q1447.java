package Gong;
import java.util.*;
// https://leetcode-cn.com/problems/simplified-fractions/
// 1447. Simplified Fractions

public class Q1447 {
    public void test() {
        List<String> list = simplifiedFractions(1);
        for (String item :  list) {
            System.out.println(item);
        }
    }

    public List<String> simplifiedFractions(int n) {
        if (n <= 1) {
            return Arrays.asList();
        }
        if (n <= 2) {
            return Arrays.asList("1/2");
        }
        List<String> list = new ArrayList<String>();
        for (int index = 1; index <= n; index++) {
            if (index <= 1 || gcd(index,n) <= 1) {
                list.add(index + "/" + n);
            }
        }

        list.addAll(simplifiedFractions(n - 1));


        return list;
    }

    private int gcd(int q, int p) {
        if(p == 0)
        {
            return q;
        }
        int r = q % p;
        return gcd(p,r);
    }
}