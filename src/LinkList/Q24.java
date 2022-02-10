package LinkList;
import LeetCode.*;

//https://leetcode-cn.com/problems/swap-nodes-in-pairs/description/
//24. Swap Nodes in Pairs

public class Q24 {
    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        head.next.next = swapPairs(head.next.next);
        ListNode newHead = head.next;
        head.next = newHead.next;
        newHead.next = head;
        return newHead;
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fakeNode = new ListNode(-1, head);
        head = head.next;

        while (fakeNode != null && fakeNode.next != null) {
            ListNode tempNode = fakeNode.next;
            fakeNode.next = fakeNode.next.next;
            tempNode.next = fakeNode.next.next;
            fakeNode.next.next = tempNode;
            fakeNode = fakeNode.next.next;
        }

        return head;
    }
}