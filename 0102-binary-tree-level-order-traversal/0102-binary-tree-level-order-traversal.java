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
    public List<List<Integer>> levelOrder(TreeNode root) {

           List<List<Integer>> res=new ArrayList<List<Integer>>();

            Queue<TreeNode> q=new LinkedList<TreeNode>();

            if(root==null){
                return res;
            }
            q.offer(root);

            while(!q.isEmpty()){


                int len=q.size();
                List<Integer> level = new ArrayList<Integer>();

                for(int i=0;i<len;i++){
                   if(q.peek().left != null){
                       q.offer(q.peek().left);
                   }
                   if(q.peek().right!=null){
                       q.offer(q.peek().right);
                   }

                   level.add(q.poll().val);
                }
                res.add(level);
                

            }
            return res;



        
    }
}