class Solution:
    def addTwoNumbers(self, l1, l2):
        if l1 is None or l2 is None:
            return l2 if l1 is None else l1
        head = None
        pre = None
        r = 0
        while l1 and l2:
            sum = l1.val + l2.val + r
            x = int(sum % 10)
            r = int(sum / 10)
            if head:
                pre.next = ListNode(x)
                pre = pre.next
            else:
                head = ListNode(x)
                pre = head
            l1 = l1.next
            l2 = l2.next
        l1 = l2 if l1 is None else l1
        while l1:
            sum = l1.val + r
            x = int(sum % 10)
            r = int(sum / 10)
            pre.next = ListNode(x)
            pre = pre.next
            l1 = l1.next
            if r is 0:
                break
        pre.next = l1
        if l1 is None and r is not 0:
            pre.next = ListNode(r)
        return head


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
