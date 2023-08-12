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

        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();

        if(root==null){
            return ans;
         }
         q.offer(root);
         q.offer(null);
        while(!q.isEmpty()){

            TreeNode t=q.poll();

            if(t==null){
                ans.add(arr);
                arr=new ArrayList<Integer>();
               if(!q.isEmpty()){
                   q.offer(null);
                }
               continue;
            }
         
            arr.add(t.val);
            if(t.left!=null){
                q.offer(t.left);
            }

            if(t.right!=null){
                q.offer(t.right);
            }
            

        }

        return ans;
        
    }
}


    //         3

    //     9.     20

    //         15      7



    //    q-      
 

    //    arr:-    

    //    ans:-   3| 9 20| 15 17     