public class LongestRepeatingCharacterWithoutRepetingCharacter {
    
}
class Solution {
   
    int m=0;
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Integer> arr=new ArrayList<>();
        
        if(s.length()==1){
            return 1;
        }
        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<s.length();j++){
                if(sb.indexOf(s.charAt(j)+"")==-1)
                sb.append(s.charAt(j));
                else
                break;

            }
           
           if(sb.length()>m){
               m=sb.length();
           }
            
        }
        return m;
    }
}