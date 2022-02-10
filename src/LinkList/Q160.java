package LinkList;
import LeetCode.*;

//https://leetcode-cn.com/problems/intersection-of-two-linked-lists/description/

public class Q160 {
    public void test() {
//        listA = [4,1,8,4,5], listB = [5,6,1,8,4,5]
        ListNode headA = new ListNode(Integer.MIN_VALUE);
        ListNode headB = new ListNode(Integer.MIN_VALUE);

        ListNode tempNodeA = headA;
        tempNodeA.next = new ListNode(1);
        tempNodeA = tempNodeA.next;
        tempNodeA.next = new ListNode(2);
        tempNodeA = tempNodeA.next;

        ListNode tempNodeB = headB;
        tempNodeB.next = new ListNode(3);
        tempNodeB = tempNodeB.next;

        ListNode commonNode = new ListNode(100);
        tempNodeA.next = commonNode;
        tempNodeB.next = commonNode;

        ListNode intersectionNode = getIntersectionNode(headA.next, headB.next);
        if (intersectionNode != null) {
            System.out.println(intersectionNode.val);
        } else {
            System.out.println("Not found");
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode lA = headA;
        ListNode lB = headB;
        while (lA != lB) {
            lA = (lA == null) ? headB : lA.next;
            lB = (lB == null) ? headA : lB.next;
        }

        return lA;
    }


    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
        while (l1 != l2) {
            l1 = (l1 == null) ? headB : l1.next;
            l2 = (l2 == null) ? headA : l2.next;
        }
        return l1;
    }
}
