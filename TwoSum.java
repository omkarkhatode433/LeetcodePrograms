import java.util.Arrays;

public class TwoSum{
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(Arrays.toString(s.twoSum(new int[]{2,4,6,3,4}, 9)));
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;

                }
            }
        }
        return arr;
    }
}