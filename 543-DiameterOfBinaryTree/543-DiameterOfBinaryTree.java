// Last updated: 8/11/2026, 2:54:45 PM
class Solution {
    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;        
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = dfs(root.left);
        int r = dfs(root.right);

        res = Math.max(res, l + r);

        return 1 + Math.max(l, r);
    }    
}