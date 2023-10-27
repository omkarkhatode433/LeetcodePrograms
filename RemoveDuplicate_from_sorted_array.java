class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        
        int count=0;
        int idx=0;
        
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[idx++]=nums[i];
            }
            
        }
        idx=idx>0?idx:1;
        if(nums[nums.length-1]!=nums[idx-1]){
            nums[idx++]=nums[nums.length-1];
        }
        return idx;
    }
}