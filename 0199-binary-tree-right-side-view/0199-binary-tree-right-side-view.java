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
    public List<Integer> rightSideView(TreeNode root) {


       
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){

            TreeNode x=q.poll();
            if(q.peek()==null&&!q.isEmpty()){
                ans.add(x.val);
            }
            if(x==null){
               if(q.isEmpty()){
                   return ans;
               }
               else{
                   q.add(null);
                   continue;
               }
             
            }

            if(x.left!=null){
                q.add(x.left);
            }
            if(x.right!=null){
                q.add(x.right);
            }
        }

        return ans;

        
    }
}