class Solution {

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        // 1. BST -> sorted array
        inorder(root, list);

        // 2. Sorted array -> balanced BST
        return build(list, 0, list.size() - 1);
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    private TreeNode build(List<Integer> list, int left, int right) {

        if (left > right) {
            return null;
        }

        // Middle becomes root
        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(list.get(mid));

        // Left half -> left subtree
        root.left = build(list, left, mid - 1);

        // Right half -> right subtree
        root.right = build(list, mid + 1, right);

        return root;
    }
}