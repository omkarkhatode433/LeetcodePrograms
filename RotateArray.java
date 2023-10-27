public class RotateArray {
    
}
class Solution {
    public void rotate(int[] nums, int k) {
        if(k==nums.length){
            return;
        }
        if(nums.length==1){
            return;
        }
        int[] arr=new int[k];
        int j=0;
        for(int i=nums.length-(k%nums.length);i<nums.length;i++){
            arr[j++]=nums[i];
        }
         for(int i=nums.length-(k%nums.length);i>0;i--){
            nums[i+(k%nums.length)-1]=nums[i-1];
        }
        for(int i=0;i<(k%nums.length);i++){
            nums[i]=arr[i];
        }
        
    }
}