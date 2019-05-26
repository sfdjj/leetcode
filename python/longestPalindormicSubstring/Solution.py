# Created by wenchao.jia on 2018/11/29.
# Mail:wenchao.jia@qunar.com


class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """

        if not s or len(s) == 0:
            return ""
        start = 0
        end = 0
        for i in range(len(s)):
            a = self.expandAroundCenter(i, i, s)
            b = self.expandAroundCenter(i, i + 1, s)
            a = a if a > b else b
            if a > end - start:
                start = i - int((a-1) / 2)
                end = i + int(a / 2) + 1
        return s[int(start): int(end)]

    def expandAroundCenter(self, l, r, s):
        while l >= 0 and r < len(s) and s[r] == s[l]:
            r = r + 1
            l = l - 1
        return r - l - 1


print(Solution().longestPalindrome("abbc"))
