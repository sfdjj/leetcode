package reverseInteger;

import java.util.Stack;

/**
 * Created by wenchao.jia on 2019-04-09.
 * Mail:wenchao.jia@qunar.com
 */
class Solution {

    public static int reverse(int x) {
        int n = Math.abs(x);
        long result = 0;
        while (n > 0) {
            int l = n % 10;
            n = n / 10;
            result = result * 10 + l;
        }
        if (result != (int) result) {
            return 0;
        }
        return x > 0 ? (int) result : (int) -result;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }
}
