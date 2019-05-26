package longSubstringWithoutRepeatingCharacters;

import java.util.*;

/**
 * Created by wenchao.jia on 2018/11/22.
 * Mail:wenchao.jia@qunar.com
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        int max = 0;
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (deque.contains(c)) {
                while (deque.pop() != c) ;
            }
            deque.addLast(c);
            max = Math.max(max, deque.size());
        }
        return Math.max(max, deque.size());
    }

    public void remove(Map<Character, Integer> map, int end, String s) {
        for (int i = 0; i <= end; i++) {
            Character index = s.charAt(i);
            map.remove(index);
        }
    }

    public static void main(String[] args) {
        String s = "aab";
        System.out.print(new Solution().lengthOfLongestSubstring(s));
    }

}
