package palindromeNumber;

/**
 * Created by wenchao.jia on 2019-05-26.
 * Mail:wenchao.jia@qunar.com
 */
public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int t = x;
        int r = 0;
        while (t > 0) {
            r = r * 10 + t % 10;
            t = t / 10;
        }
        System.out.println(r);
        return x == r;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(1121));
    }
}
