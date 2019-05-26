class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashMap = dict()
        for i, x in enumerate(nums):
            if target - x in hashMap:
                return [i, hashMap[target - x]]
            hashMap[x] = i


Solution().twoSum(list((1, 2, 3, 4)), 7)
