public class FindPeakElement {
    
}
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length>1){

            if(nums[1]<nums[0]){
                return 0;
            }
        }else{
            return 0;
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]<nums[i]&&nums[i+1]<nums[i]){
                return i;
            }
        }
        return nums.length-1;
        
    }
}
