public class PathSum2 {
    
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
    static List<List<Integer>> l;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        r(root,targetSum,targetSum,l1);
        return l;        
    }public static void r(TreeNode root, int t,int t1,List<Integer> l1){
        
        if(root==null){
            return;
        }
        
        l1.add(root.val);
        int s=0;
        List<Integer> l2=new ArrayList<>();
        System.out.print(l1);
        for(int i:l1){
            l2.add(i);
            s+=i;
        }
        
        
        r(root.left,t-root.val,t1,l1);
        r(root.right,t-root.val,t1,l1);
        if(s==t1&&(root.left==null&&root.right==null)){
            
            l.add(l2);
        }
        l1.remove(l1.size()-1);
        
    }
}