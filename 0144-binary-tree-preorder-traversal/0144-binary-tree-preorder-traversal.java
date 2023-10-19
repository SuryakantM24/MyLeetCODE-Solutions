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

        Stack<TreeNode> stack=new Stack<>();
        List<Integer> res=new ArrayList<>();

        if(root==null){
            return res;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            res.add(temp.val);
            if(temp.right!=null){
                stack.add(temp.right);
            }
            if(temp.left!=null){
                stack.add(temp.left);
            }
           
        }
        return res;
        
    }
}