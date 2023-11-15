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
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     if(root == null) return new ArrayList<>();
        
    //     List<Integer> rlt = new ArrayList<>();
    //     rlt.addAll(inorderTraversal(root.left));
    //     rlt.add(root.val);
    //     rlt.addAll(inorderTraversal(root.right));
    //     return rlt;
    // }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rlt = new ArrayList<>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        while(root!=null || !stk.isEmpty()){
            while(root != null){
                // 压入根和全部左节点, 如果当前跟有有节点，在弹出之后迭代为右节点
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            rlt.add(root.val);
            root = root.right;
        }


        return rlt;
    }
    

}