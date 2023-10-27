public class FirstMissingPositive {
    
}
class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] arr =new boolean[nums.length];
        Arrays.sort(nums);
        int num=1;
        if(nums[0]>1){
            return 1;
        }else{
            for(int i=0;i<nums.length; ){
                if(nums[i]>num){
                    return num;
                }else if(nums[i]==num){
                    num++;
                }else
                i++;
            }
        }
        return num;



    }
}