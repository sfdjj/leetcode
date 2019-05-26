package twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenchao.jia on 2018/11/20.
 * Mail:wenchao.jia@qunar.com
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums,9);
        if(result==null) {
            return;
        }
        for (int r:result) {
            System.out.println(r);
        }
    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
