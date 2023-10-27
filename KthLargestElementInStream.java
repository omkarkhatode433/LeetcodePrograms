public class KthLargestElementInStream {
    
}
class KthLargest {
    public int l=0;
    public int s=0;
    int[] arr=new int[100000];

    public KthLargest(int k, int[] nums) {
        System.arraycopy(nums, 0, arr,0, nums.length);
        s=nums.length;
        l=k;
        
    }
    
    public int add(int val) {
        arr[s++]=val;
        Arrays.sort(arr,0,s);
        return arr[s-l];
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */