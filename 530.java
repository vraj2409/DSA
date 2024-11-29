import java.util.*;
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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ans = inorder(root);
        int min = Integer.MAX_VALUE;
        int i = 0;
        while(i < ans.size() - 1){
            if(Math.abs(ans.get(i)-ans.get(i+1)) < min){
                min = Math.abs(ans.get(i)-ans.get(i+1));
            }
            i++;
        }
        return min;
    }
    public ArrayList<Integer> inorder(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !s.isEmpty()){
            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            ans.add(curr.val);
            curr = curr.right;
        }
        return ans;
    }
}