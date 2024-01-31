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
    List<Integer> list=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
       inOrder(root);
       int minDiff=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            minDiff= Math.min(minDiff, list.get(i)-list.get(i-1));
        }
        return minDiff;
    }
    
    public void inOrder(TreeNode root){
        if(root ==null){
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}