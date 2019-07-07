# Created by wenchao.jia on 2019-07-02.
# Mail:wenchao.jia@qunar.com
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        result = None
        p1 = head
        p2 = head.next
        all_next = None
        pre = None
        while p1 and p2:
            if not result:
                result = p2
            all_next = p2.next
            p2.next = p1
            p1.next = all_next
            if pre:
                pre.next = p2
            pre = p1
            p1 = p1.next
            if p1:
                p2 = p1.next
        return result


a = ListNode(1)
b = ListNode(2)
c = ListNode(3)
d = ListNode(4)
e = ListNode(5)

# a.next = b
# b.next = c
# c.next = d
# d.next = e

x = Solution().swapPairs(a)
while x:
    print(x.val)
    x = x.next
