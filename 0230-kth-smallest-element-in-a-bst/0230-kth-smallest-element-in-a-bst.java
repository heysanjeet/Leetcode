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
    public int kthSmallest(TreeNode root, int k) {
        
        List<Integer> sortedNodeValue=new ArrayList<>();
        inOrderTraverse(root, sortedNodeValue);
        return sortedNodeValue.get(k-1);
    }
    //traverse the element inOrder, sorted order store it in list.
    public static  void inOrderTraverse(TreeNode root, List<Integer> sortedNodeValue){
        if(root == null){
            return;
        }
        
        inOrderTraverse(root.left, sortedNodeValue);
        sortedNodeValue.add(root.val);
        inOrderTraverse(root.right, sortedNodeValue);
    }
}