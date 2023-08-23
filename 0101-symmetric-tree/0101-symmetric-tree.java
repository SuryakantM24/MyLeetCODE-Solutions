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


    public boolean isSymmetricHelp(TreeNode  left,TreeNode right){

        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        boolean res1= isSymmetricHelp(left.right,right.left);
        boolean res2= isSymmetricHelp(right.right,left.left);
        return res1&&res2;
    }
    public boolean isSymmetric(TreeNode root) {

        return isSymmetricHelp(root.left,root.right);
    }
}
         