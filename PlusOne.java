public class PlusOne {
    
}
class Solution {
    public int[] plusOne(int[] digits) {
        int c=1;
        int[] arr;
        for(int i=digits.length-1;i>=0;i--){
            
            digits[i]=(digits[i]+c);
            if(digits[i]>9){
                c=1;
                digits[i]=(digits[i])%10;
            }else{
                c=0;
            }
        }
        if(c==1){
            arr=new int[digits.length+1];
            arr[0]=1;
            System.arraycopy(digits,0,arr,1,digits.length);
        }else{
            arr=new int[digits.length];
            System.arraycopy(digits,0,arr,0,digits.length);

        }
        return arr;

        
    }
}
