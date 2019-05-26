# Created by wenchao.jia on 2019-05-26.
# Mail:wenchao.jia@qunar.com

class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        r = 0
        t = x
        while t > 0:
            r = r * 10 + t % 10
            t = int(t / 10)
        return r == x


print(Solution().isPalindrome(121))
