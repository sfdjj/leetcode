package medianOfTwoSortedArrays;

/**
 * Created by wenchao.jia on 2018/11/27.
 * Mail:wenchao.jia@qunar.com
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2 == null||nums2.length==0) {
            if(nums1.length%2==0) {
                return (nums1[nums1.length/2]+nums1[nums1.length/2-1])/2;
            }else{
                return nums1[nums1.length/2];
            }
        }
        if(nums1 == null||nums1.length==0) {
            if(nums2.length%2==0) {
                return (double) (nums2[nums2.length/2]+nums2[nums2.length/2-1])/2;
            }else{
                return nums2[nums2.length/2];
            }
        }
        int i = 0;
        int j = 0;
        int len = nums1.length + nums2.length;
        double result = 0;
        boolean flag = true;
        while (i + j <= len / 2 && i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                result = nums2[j];
                j++;
                flag = false;
            } else {
                result = nums1[i];
                i++;
                flag = true;
            }
        }
        while (i + j <= len / 2 && i < nums1.length) {
            result = nums1[i];
            i++;
            flag = true;
        }
        while (i + j <= len / 2 && j < nums2.length) {
            result = nums2[j];
            j++;
            flag = false;
        }
        if (len % 2 == 0) {
            i--;
            j--;
            if(flag) {
                i--;
            }else {
                j--;
            }
            if(i>=0&&j>=0) {
                result = (result + Math.max(nums1[i], nums2[j])) / 2;
            }else if(i>=0) {
                result = (result+nums1[i])/2;
            }else {
                result = (result+nums2[j])/2;
            }

        }
        return result;

    }

    public static void main(String args[]) {
        int[] nums1 = new int[]{10000};
        int[] nums2 = new int[]{10001};
        System.out.println(new Solution().findMedianSortedArrays(nums1, nums2));
    }

}
