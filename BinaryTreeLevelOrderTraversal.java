public class BinaryTreeLevelOrderTraversal {
    
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
    List<List<TreeNode>> l=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al=new ArrayList<>();
        if(root==null)return al;
        print(root);
        for(List<TreeNode> i:l){
            List<Integer> l1=new ArrayList<>();
            for(TreeNode j:i){
                l1.add(j.val);
            }
            al.add(l1);
        }
        l=null;
        return al;
    }
    public void print(TreeNode root) {
        List<TreeNode> l1=new ArrayList<>();
        l1.add(root);
        l.add(l1);
        for(int i=0;i<l.size();i++){
            l1=new ArrayList<>();
            for(TreeNode j:l.get(i)){
                if(j.left!=null){
                    l1.add(j.left);
                }
                if(j.right!=null){
                    l1.add(j.right);
                }

            }
            if(l1.size()>0)
            l.add(l1);
        }
    }
}
