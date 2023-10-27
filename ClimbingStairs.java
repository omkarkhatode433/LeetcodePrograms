public class ClimbingStairs {
    
}
class Solution {
    public int climbStairs(int n) {
       
        
        return solve(n);
        
    }
     public static int solve(int n){
         if(n==0||n==1){
             return n;
         }
         int c=1;
         int p=1;
         int n1=0;
         for(int i=0;i<n-1;i++){
             n1=c+p;
             p=c;
             c=n1;

         }
         return n1;
     }
    
}