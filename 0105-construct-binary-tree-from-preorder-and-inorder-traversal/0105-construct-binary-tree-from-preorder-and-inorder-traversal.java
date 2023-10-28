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

    private int rootidx=0;

    public TreeNode buildTreeHelp(int[] preorder,int[] inorder,int si,int ei){


        if(si>ei){
            return null;
        }
        TreeNode root= new TreeNode(preorder[rootidx++]);
        int idx=0;
        for(int i=si;i<=ei;i++){
            if(inorder[i]==root.val){
                idx=i;
                break;
            }
        }
        
        root.left=buildTreeHelp(preorder,inorder,si,idx-1);
        root.right=buildTreeHelp(preorder,inorder,idx+1,ei);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return buildTreeHelp(preorder,inorder,0,preorder.length-1);

        
    }
}