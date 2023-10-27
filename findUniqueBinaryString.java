public class findUniqueBinaryString {
    
}
class Solution {
    static String str;
    public String findDifferentBinaryString(String[] nums) {
        if(nums.length==0){
            return "";
        }
        
        r(nums,nums[0].length(),"");
        return str;
        
    }
    public static boolean r(String[] nums,int n,String s){
        if(n==0){
            for(int i=0;i<nums.length;i++){
                if(s.equals(nums[i])){
                    return false;
                }
            }
            str=s;
            return true;
        }
        return r(nums,n-1,s+"1")||r(nums,n-1,s+"0");
        
    }
}
