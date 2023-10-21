class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int reverse=0;
        for(num=x;num>0;num=num/10){
            reverse=reverse*10+num%10;
        }
        if(reverse==x)
        return true;
        return false;
        
    }
}