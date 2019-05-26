# Created by wenchao.jia on 2018/11/29.
# Mail:wenchao.jia@qunar.com


class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if s == "" or numRows == 1:
            return s
        k = (numRows - 1) * 2
        rows = [[] for r in range(numRows)]
        for i, j in enumerate(s):
            for r in range(numRows):
                if i % k == r or i % k == (k - r):
                    rows[r] += [j]
        return ''.join([''.join(x) for x in rows])

print(Solution().convert("PAYPALISHIRING", 3))
