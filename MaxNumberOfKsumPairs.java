public class MaxNumberOfKsumPairs {
    
}
class Solution {
    public int maxOperations(int[] nums, int k) {
        int c=0;
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        while(s<e){
            if(nums[s]+nums[e]<k){
                s++;
            }else if(nums[s]+nums[e]>k){
                e--;
            }else{
                nums[s++]=0;
                nums[e--]=0;
                c++;
            }
        }
        return c;        
    }
}
