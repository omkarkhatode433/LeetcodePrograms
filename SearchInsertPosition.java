public class SearchInsertPosition {
    
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target){
            return nums.length;
        }else if(nums[nums.length-1]==target){
            return nums.length-1;
        }else if(nums[0]>target){
            return 0;

        }else{
            int s=0;
            
            return BinarySearch(nums,0,nums.length-1,target)+1;
        }
        
    }
    public static int BinarySearch(int[] nums,int s,int e,int t){
        int mid=(s+e)/2;
        if(nums[mid]==t){
            return mid-1;
        }

        if(nums[mid]<t&&nums[mid+1]>t){
            return mid;
        }else if(nums[mid]>t){
            return BinarySearch(nums,s,mid,t);
        }else{
            return BinarySearch(nums,mid+1,e,t);

        }
        
    }
}