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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }if(val==root.val){
            return root;
        }if(val>root.val){
            return searchBST(root.right, val);
        }
        return searchBST(root.left, val);
    }
    
    public TreeNode searchBSTIterative(TreeNode root, int val) {
        while(root !=null && root.val !=val){
            root= val<root.val ? root.left : root.right;
        }
        return root;
    }
}