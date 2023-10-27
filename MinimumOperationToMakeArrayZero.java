public class MinimumOperationToMakeArrayZero {
    
}
class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(i==0){
                continue;
            }
            set.add(i);
        }
        return set.size();
        
    }
}