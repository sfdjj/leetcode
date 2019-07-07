package longestCommonPrefix;

/**
 * Created by wenchao.jia on 2019-07-05.
 * Mail:wenchao.jia@qunar.com
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int j = 0;
        while (j < strs[0].length()) {
            boolean flag = false;
            Character c = null;
            for (int i = 0; i < strs.length; i++) {
                if (j == strs[i].length()) {
                    flag = true;
                    break;
                }
                if (c == null) {
                    c = strs[i].charAt(j);
                } else {
                    if (c != strs[i].charAt(j)) {
                        flag = true;
                        break;
                    }
                }


            }
            if (flag) {
                break;
            }
            sb.append(c);
            j++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(new Solution().longestCommonPrefix(strs));
    }
}
