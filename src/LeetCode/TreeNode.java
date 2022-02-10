package LeetCode;

public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void print() {
        System.out.println(" " + val);
        if (left != null) {
            left.print();;
        } else {
            System.out.println(" null");
        }
        if (right != null) {
            right.print();;
        } else {
            System.out.println(" null");
        }
    }
}
