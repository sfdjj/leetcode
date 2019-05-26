package StringToInteger;

import java.util.regex.Pattern;

/**
 * Created by wenchao.jia on 2019-04-10.
 * Mail:wenchao.jia@qunar.com
 */
public class Solution {


    public int myAtoi(String str) {
        String regex = "[\\+\\-]{0,1}\\d+.*";
        if (Pattern.matches(regex, str.trim())) {
            String a[] = str.trim().split("\\D");
            char x = str.trim().charAt(0);
            String y = "";
            if (Pattern.matches("\\d+", a[0])) {
                y = a[0];
            } else if (Pattern.matches("\\d+", a[1])) {
                y = a[1];
            }
            if (x == '-') {
                return format(-parse(y));
            } else if (x == '+') {
                return format(parse(y));
            } else {
                return format(parse(y));
            }
        }
        return 0;
    }

    public long parse(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            return Long.MAX_VALUE - 1;
        }
    }

    public int format(long x) {
        if (x < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (x > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) x;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("-5-"));
    }

}
