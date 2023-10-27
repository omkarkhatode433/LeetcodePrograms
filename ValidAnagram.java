public class ValidAnagram {
    
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
            StringBuilder sb1=new StringBuilder();
            StringBuilder sb2=new StringBuilder();
            sb1.append(s);
            sb2.append(t);
            for(int i=s.length()-1;i>=0;i--){
                char c=sb1.charAt(i);
                sb1.deleteCharAt(i);
                int idx=sb2.indexOf(c+"");
                if(idx==-1){
                    return false;
                }
                sb2.deleteCharAt(idx);
            }
        }
        return true;
        
    }
}