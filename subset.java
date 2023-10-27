public class subset {
    
}
class Solution {
    static List<List<Integer>> l;
    
    public List<List<Integer>> subsets(int[] nums) {
        for(int i=0;i<nums.length/2;i++){
            int t=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=t;
        }
        
        l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        rlist(nums,nums.length,l1);
        l.add(new ArrayList<>());
        return l;
    }
    public static void rlist(int[] nums,int n,List<Integer> l1){
        if(n<=0){
            return;
        }   
        l1.add(nums[n-1]);
        rlist(nums,n-1,l1);
        List<Integer> l2=new ArrayList<>();
        for(int i:l1){
            l2.add(i);
        }
        l.add(l2);
        l1.remove(l1.size()-1);
        rlist(nums,n-1,l1);
    }
}