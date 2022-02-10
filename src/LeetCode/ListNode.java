package LeetCode;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void print() {
        System.out.println(val);
        ListNode node = next;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
