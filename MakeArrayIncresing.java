public class MakeArrayIncresing {
    
}
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int[] arr=new int[nums.length-1];
            int idx=0;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                arr[idx++]=nums[j];
            }

            if(isInccreasing(arr)){
                return true;
            }

        }
        return false;
        
    }
    public static boolean isInccreasing(int[] nums){
       for(int i=1;i<nums.length;i++){
           if(nums[i-1]>=nums[i]){
               return false;
           }
       }
       return true;


    }
}