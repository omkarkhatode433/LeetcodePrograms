public class IntegerREplacement {
    
}
class Solution {
    
    public int integerReplacement(int n) {
        if(n==Integer.MAX_VALUE){
            return 32;
        }
        return r(n);       
    }
    public static int r(int n){
        if(n==1)return 0;
        if(n%2==0){
            return 1+r(n/2);
        }else{
            return 1+Math.min(r(n+1),r(n-1));
        }
    }
}
