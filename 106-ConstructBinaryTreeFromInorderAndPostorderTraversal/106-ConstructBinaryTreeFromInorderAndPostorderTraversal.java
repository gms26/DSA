// Last updated: 5/25/2026, 11:12:10 AM
class Solution {
    HashMap<Integer, Integer> map;
    int pi;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        pi = postorder.length - 1;
        return dfs(postorder, 0, inorder.length - 1);
    }

    private TreeNode dfs(int[] postorder, int si, int li) {
        if (si > li) return null;

        int val = postorder[pi--];
        TreeNode root = new TreeNode(val);

        int mid = map.get(val);

        // IMPORTANT: build right first
        root.right = dfs(postorder, mid + 1, li);
        root.left = dfs(postorder, si, mid - 1);

        return root;
    }
}
