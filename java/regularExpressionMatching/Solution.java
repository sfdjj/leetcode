package regularExpressionMatching;


/**
 * Created by wenchao.jia on 2019-05-26.
 * Mail:wenchao.jia@qunar.com
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        char ss[] = s.toCharArray();
        char pp[] = p.toCharArray();
        int i = 0;
        int j = 0;
        boolean flag = false;
        Character pre = null;
        while (i < ss.length && j < pp.length) {
            if (ss[i] == pp[j]) {
                flag = true;
                pre = ss[i];
                i++;
                j++;
            } else if (pp[j] == '.') {
                pre = pp[i];
                i++;
                j++;
            } else if (pp[j] == '*') {
                if (pre != null && (ss[i] == pre || pre == '.')) {
                    flag = true;
                    i++;
                } else {
                    j++;
                }
            } else {
                pre = pp[j];
                j++;
            }
        }
        if (j < pp.length) {
            for (; j < pp.length; j++) {
                if (pp[j] != '*' && pp[j] != pre) {
                    return false;
                }
            }
        }
        return j == pp.length && i == ss.length && flag;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isMatch("aaaa", "aa*a"));
    }
}
