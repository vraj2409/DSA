import java.util.*;;
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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = inorder(root);
        return ans.get(k-1);
    }
    public List<Integer> inorder(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !s.isEmpty()) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }curr = s.pop();
            ans.add(curr.val);
            curr = curr.right;
        }
        return ans;
    }
}