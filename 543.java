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
    private int largestdiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return largestdiameter;
    }
    public int height(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        int d = l + r;
        largestdiameter = Math.max(largestdiameter,d);
        return Math.max(l, r)+1;
    }
}