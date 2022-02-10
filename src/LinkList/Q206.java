package LinkList;
import LeetCode.*;

//https://leetcode-cn.com/problems/reverse-linked-list/description/
//206. Reverse Linked List

public class Q206 {
    public void test() {
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        ListNode newHead = reverseList(next);
        next.next = head;
        head.next = null;
        return newHead;
    }
}