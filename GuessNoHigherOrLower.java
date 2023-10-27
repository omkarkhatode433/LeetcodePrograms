public class GuessNoHigherOrLower {
    
}
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        // for(int i=0;i<=n;i++){
        //     if(guess(i)==0){
        //         return i;
        //     }
        // }
        // return 0;
        Solution s=new Solution();
        return s.gesss(0,n);
        
    }public int gesss(int s,int e){
        int m=s+(e-s)/2;
        if(guess(m)==0){
            return m;
        }
        if(guess(m)==-1){
             return gesss(s,m);
        }else{
             return gesss(m+1,e);
        }
        // return 0;
    }
}
