public class RemoveDuplicateArray2 {
    
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int[] n=new int[nums.length];
        int i=2;
        if(nums.length<3){
            return nums.length;
        }
        n[0]=nums[0];
        n[1]=nums[1];
        for(int j=2;j<nums.length;j++){
            if(nums[j]!=n[i-1]||nums[j]!=n[i-2]){
                n[i++]=nums[j];
            }

        }
        // System.out.print(Arrays.toString(n));
        System.arraycopy(n,0,nums,0,nums.length);
        n=null;
        return i;
    }
}