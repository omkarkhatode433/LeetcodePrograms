import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newarr =new int[nums1.length+nums2.length];
        int l=newarr.length;
        System.arraycopy(nums1,0,newarr,0,nums1.length);
        System.arraycopy(nums2,0,newarr,nums1.length,nums2.length);
        Arrays.sort(newarr);
        if((nums1.length+nums2.length)%2==0){
            int i=l/2;
            double d=Double.valueOf(newarr[i]+newarr[i-1])/2;
            return d;
        }
        return newarr[(l)/2];
    }
}
