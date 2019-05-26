package addTwoNumbers;

/**
 * Created by wenchao.jia on 2018/11/21.
 * Mail:wenchao.jia@qunar.com
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode p = l1;
        ListNode q = l2;
        ListNode head = null;
        ListNode pre = null;
        int r = 0;
        while (p != null && q != null) {
            int sum = p.val + q.val + r;
            int x = sum % 10;
            r = sum / 10;
            ListNode node = new ListNode(x);
            if (head == null) {
                head = node;
                pre = node;
            } else {
                pre.next = node;
                pre = pre.next;
            }
            p = p.next;
            q = q.next;
        }
        p = p == null ? q : p;
        while (p != null) {
            int sum = p.val + r;
            int x = sum % 10;
            r = sum / 10;
            ListNode node = new ListNode(x);
            pre.next = node;
            pre = pre.next;
            p = p.next;
            if (r == 0) {
                break;
            }
        }
        if (p == null && r != 0) {
            pre.next = new ListNode(r);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(5);
        Solution solution = new Solution();
        ListNode p = solution.addTwoNumbers(listNode1, listNode2);
        while (p != null) {
            System.out.print(p.val);
            p = p.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
