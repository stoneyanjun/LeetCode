package LinkList;
import LeetCode.*;

//https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/description/
//83. Remove Duplicates from Sorted List

public class Q83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        while (pre != null) {
            if (pre.next != null && pre.val == pre.next.val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }

        return head;
    }
}