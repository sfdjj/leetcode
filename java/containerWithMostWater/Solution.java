package containerWithMostWater;

import java.util.Stack;

/**
 * Created by wenchao.jia on 2019-07-04.
 * Mail:wenchao.jia@qunar.com
 */
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int l = right - left;
            int h = 0;
            if (height[left] < height[right]) {
                h = height[left];
                left++;
            } else {
                h = height[right];
                right--;
            }
            max = Math.max(max, l * h);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] x = {1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution().maxArea(x));
    }
}
