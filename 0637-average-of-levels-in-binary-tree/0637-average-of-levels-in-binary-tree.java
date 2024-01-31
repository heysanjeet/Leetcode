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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>(List.of(root));
        List<Double> ans=new ArrayList<>();
        while(queue.size() > 0){
            double qlength=queue.size(), row=0;
            for(int i=0;i< qlength;i++){
                TreeNode curr=queue.poll();
                row +=curr.val;
                if(curr.left !=null)
                    queue.offer(curr.left);
                if(curr.right !=null)
                    queue.offer(curr.right);
            }
            ans.add(row/qlength);
        }
        return ans;
    }
}