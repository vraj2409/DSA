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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hastarget(root , 0 ,targetSum);
    }
    public boolean hastarget(TreeNode root , int currsum ,int target){
        if(root == null){
            return false;
        }
        currsum += root.val;
        if(root.left == null && root.right == null){
            return currsum == target;
        }
        return hastarget(root.left , currsum , target) || hastarget(root.right , currsum , target);
    }
}