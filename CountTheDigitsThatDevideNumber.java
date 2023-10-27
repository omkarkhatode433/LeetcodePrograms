public class CountTheDigitsThatDevideNumber {
    
}
class Solution {
    public int countDigits(int num) {
        int c=0;
        int n=num;
        while(n>0){
            if(num%(n%10)==0){
                c++;
            }
            n=n/10;
        }
        return c;
        
    }
}