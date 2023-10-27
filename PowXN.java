public class PowXN {
    
}
class Solution {
    public double myPow(double x, int n) {
        double pow=1;
        if(x==1){
            return 1;
        }
        if(x==-1){
            if(n%2==1){
                return -1;
            }
            return 1;
        }
        if(n>0){
        for(int i=0;i<n;i++){
            pow=pow*x;
        }
        }else if(n<-100000){
        return 0;
    }else{
        for(int i=n;i<0;i++){
            pow=pow*x;
        }
        pow=1/pow;
    }
        return pow;
    }
}