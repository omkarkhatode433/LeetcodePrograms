class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)return nums[0];
        for(int i=0;i<nums.length/2;i++){
            if(nums[i]!=nums[i+1])return nums[i];
            if(nums[nums.length-1-i]!=nums[nums.length-2-i])return nums[nums.length-1-i];
            i++;
        }
        return nums[nums.length/2];
        
    }
}