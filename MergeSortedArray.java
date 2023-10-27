public class MergeSortedArray {
    
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n1) {
        int n[]=new int[nums1.length];
        int fi=0;
        int si=0;
        int i=0;
        while(fi<m&&si<nums2.length){
            if(nums1[fi]<nums2[si]){
                n[i++]=nums1[fi++];
            }else{
                n[i++]=nums2[si++];
            }
        }
        System.arraycopy(nums1,fi,n,i,m-fi);
        System.arraycopy(nums2,si,n,i,nums2.length-si);
                System.arraycopy(n,0,nums1,0,nums1.length);
   
        
    }
}