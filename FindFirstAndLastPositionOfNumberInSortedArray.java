public class FindFirstAndLastPositionOfNumberInSortedArray {
    
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int n=BinarySearch(nums,target,0,nums.length-1);
        if(n==-1){
            return new int[]{-1,-1};
        }else{
            int s=n;
            int e=n;
            while(s-1>=0&&nums[s-1]==target){
                s--;
            }
            while(e+1<nums.length&&nums[e+1]==target){
                e++;
            }
            return new int[]{s,e};

        }
        
    }
    public int BinarySearch(int[] nums, int t,int s,int e){
        int m=s+(e-s)/2;
        
        if(nums[m]==t){
            return m;
        }
        if(s>=e){
            return -1;
        }
        if(nums[m]<t)
        return BinarySearch(nums, t, m+1, e);
        else
        return BinarySearch( nums,  t, s, m);
    }
}