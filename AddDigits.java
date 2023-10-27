public class AddDigits {
    
}
class Solution {
    public int addDigits(int num) {
        int n=0;
        while(num>0){
            n+=num%10;
            num=num/10;
            if(num==0&&n>=10){
                num=n;
                n=0;
            }

        }
        return n;
        
    }
}