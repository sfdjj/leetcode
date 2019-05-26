# Created by wenchao.jia on 2019-04-09.
# Mail:wenchao.jia@qunar.com
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        y = abs(x)
        result = 0
        while y > 0:
            k = y % 10
            y = y // 10
            result = result * 10 + k
        if result > 2 ** 31:
            return 0
        return result if x > 0 else -result


print(Solution().reverse(-123))
