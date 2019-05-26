package zigZagConversion;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by wenchao.jia on 2019-03-25.
 * Mail:wenchao.jia@qunar.com
 */
public class Solution {

    public static String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || s.length() == 1 || numRows == 1) {
            return s;
        }
        int k = numRows + numRows - 2;
        ArrayList<Character>[] result = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            result[i] = new ArrayList<Character>();
        }
        for (int i = 0; i < s.length(); i++) {
            Character j = s.charAt(i);
            for (int r = 0; r < numRows; r++) {
                if (i % k == r || i % k == (k - r)) {
                    result[r].add(j);
                }
            }
        }
        String x = "";
        for (int i = 0; i < numRows; i++) {
            for (Character c : result[i]) {
                x = x + c;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }
}