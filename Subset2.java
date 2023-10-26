import java.util.*;

public class Subset2 {
    
}
class Solution {
    static List<List<Integer>> l;
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
                
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
        boolean f=true;
        for(List<Integer> i:l){
            if(i.equals(l2)){
                f=false;
            }
        }
        if(f)
        l.add(l2);
        l1.remove(l1.size()-1);
        rlist(nums,n-1,l1);
    }
}

