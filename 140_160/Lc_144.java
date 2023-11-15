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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> rlt = new ArrayList<>();
        Deque<TreeNode> stk = new LinkedList<>();

        while(root != null || !stk.isEmpty()){
            while(root!=null){
                rlt.add(root.val);
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            // rlt.add(root.right);
            root = root.right;

        }
        return rlt;
    }
}