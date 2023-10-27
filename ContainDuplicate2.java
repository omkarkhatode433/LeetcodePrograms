class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        ArrayList<Integer> s=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<i+k+1&&j<nums.length;j++){
                    if(nums[i]==nums[j])
                    return true;
                }
            
            s.add(i);
        }
        return false;
        
    }
}