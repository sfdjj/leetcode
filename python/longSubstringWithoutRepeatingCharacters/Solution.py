# Created by wenchao.jia on 2018/11/22.
# Mail:wenchao.jia@qunar.com
from queue import Queue


class Solution:
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        start = 0
        max_len = 0
        d = {}
        for i, c in enumerate(s):
            if c in d and d[c] >= start:
                max_len = max(max_len, i - start)
                start = d[c] + 1
            d[c] = i
        return max(max_len, len(s) - start)


print(Solution().lengthOfLongestSubstring('aab'))
