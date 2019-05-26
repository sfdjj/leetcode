# Created by wenchao.jia on 2018/11/27.
# Mail:wenchao.jia@qunar.com

class Solution:
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        num = (nums1 + nums2)
        num.sort()
        return num[int(len(num) / 2)] if len(num) % 2 != 0 else (num[int(len(num) / 2)] + num[int(len(num) / 2) - 1]) / 2


nums1 = [1, 3]
nums2 = [2, 4]
print(Solution().findMedianSortedArrays(nums1, nums2))
