package LinkList;
import LeetCode.*;

//https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/description/
//19. Remove Nth Node From End of List

public class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode first = head;
        while ( n-- > 0) {
            first = first.next;
        }

        if (first == null) {
            return head.next;
        }
        while (first.next != null) {
            first = first.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
