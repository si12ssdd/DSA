/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int maxDepth = -1;
    int sum = 0;

    public int deepestLeavesSum(TreeNode root) {

        maxDepth = findDepth(root);

        findSum(root, 0);

        return sum;
    }

    // DFS 1: Find maximum depth
    private int findDepth(TreeNode root) {

        if (root == null) {
            return -1;
        }

        int left = findDepth(root.left);
        int right = findDepth(root.right);

        return Math.max(left, right) + 1;
    }

    // DFS 2: Sum all deepest leaves
    private void findSum(TreeNode root, int depth) {

        if (root == null) {
            return;
        }

        // Leaf node
        if (root.left == null && root.right == null) {

            if (depth == maxDepth) {
                sum += root.val;
            }

            return;
        }

        findSum(root.left, depth + 1);
        findSum(root.right, depth + 1);
    }
}