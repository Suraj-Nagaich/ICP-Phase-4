class Solution {
    private void sol(TreeNode root, List<Integer> nodes) {
        if (root == null) return;
        sol(root.left, nodes);
        nodes.add(root.val);
        sol(root.right, nodes);
    }
    private TreeNode buildBST(int left, int right, List<Integer> nodes) {
        if (left > right) return null;
        int mid = (left + right) / 2; 
        TreeNode root = new TreeNode(nodes.get(mid));
        root.left = buildBST(left, mid - 1, nodes);
        root.right = buildBST(mid + 1, right, nodes);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        sol(root, nodes);
        return buildBST(0, nodes.size() - 1, nodes);
    }
}
