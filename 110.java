class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
 }

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return((Math.abs(height(root.left) - height(root.right)) < 2) && 
        (isBalanced(root.left)  && isBalanced(root.right)) ? true   :false);
    }
    public int height(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l, r)+1;
    }
}