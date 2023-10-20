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
    public int diameterOfBinaryTree(TreeNode root) {

        int[] res=diameterHelp(root);
        return res[0];
        
    }
  


     //{d,h}

    public int[] diameterHelp(TreeNode root){

        if(root==null){
            int[] base=new int[]{0,-1};  
            return base;
        }


        int[] lres=diameterHelp(root.left);
        int[] rres=diameterHelp(root.right);

        int[] mres=new int[2];

        mres[0]=Math.max(Math.max(lres[0],rres[0]),lres[1]+rres[1]+2);
        mres[1]=Math.max(lres[1],rres[1])+1;

        return mres;
    }
}

  
        //          1
        //      2        3  
        //  4       5     