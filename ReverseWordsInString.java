public class ReverseWordsInString {
    
}
class Solution {
    public String reverseWords(String s) {
        s.strip();
        String st[] =s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=st.length-1;i>=0;i--){
            if(st[i].length()==0){
                continue;
            }
            sb.append(st[i]);
            if(i==0){
                break;
            }
            sb.append(" ");
        }
        return sb.toString().strip();
        
    }
}