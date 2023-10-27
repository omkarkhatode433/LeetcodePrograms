public class sqrt_x {
    
}
class Solution {
    public int mySqrt(int x) {
        long x1=Long.valueOf(x);
        long i=0;
       while(i*i<=x1){
           i++;
       }
       long j=i*i==x1?i:i-1;
       int k=(int)j;
        return k;
    }
}