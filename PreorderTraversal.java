public class PreorderTraversal {
    
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
    List<Integer> l=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        travrs(root);
        return l;        

    }
    public void travrs(TreeNode root) {
        if(root==null){
            return;
        }
        l.add(root.val);
        travrs(root.left);
        travrs(root.right);

    
    }
}
