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

    public boolean isBala=true;

    public int Height(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftH=Height(root.left);
        int rightH=Height(root.right);

        if(Math.abs(leftH-rightH)>1){
            isBala=false;
        }

        return Math.max(leftH,rightH)+1;
    }
    public boolean isBalanced(TreeNode root) {

        Height(root);

        return isBala;
        
    }
}