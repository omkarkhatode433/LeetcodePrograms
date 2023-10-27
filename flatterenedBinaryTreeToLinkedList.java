public class flatterenedBinaryTreeToLinkedList {
    
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
    TreeNode n=new TreeNode();
    ArrayList<Integer> al=new ArrayList<>();
    public void flatten(TreeNode root) {
        fill(root);
        // System.out.print(al);
        for(int i=0;i<al.size();i++){
            root.val=al.get(i);
            root.left=null;
            if(i<al.size()-1){
                root.right=new TreeNode();
                root=root.right;
            }
            
        }
        
        
    }
    
    public void print(TreeNode root) {
        if(root==null){
            return;
        }
        System.out.print(root.val);
        print(root.left);
        print(root.right);
        
    }
    public void fill(TreeNode root) {
        if(root==null){
            return;
        }
        al.add(root.val);
        fill(root.left);
        fill(root.right);
        
    }
}
