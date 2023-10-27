public class LengthOfLastWord {
    
}
class Solution {
    public int lengthOfLastWord(String s) {
        String s1=s.strip();
        String[] st=s1.split(" ");
        return st[st.length-1].length();
        
    }
}