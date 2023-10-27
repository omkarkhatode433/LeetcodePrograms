public class BinaryTreeInorderTraversal {
    
}
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
    static List<Integer> al;
    public List<Integer> inorderTraversal(TreeNode root) {
        al=new ArrayList<>();
        trvrs(root);
        return al;       
        
    }
    public static void trvrs(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            trvrs(root.left);
        }
        al.add(root.val);
        if(root.right!=null){
            trvrs(root.right);
        }

    }
}