public class MergeStringsAlternately {
    
}
class Solution {
    public String mergeAlternately(String word1, String word2) {
        boolean b;
        int l=(b=word1.length()>word2.length())?word2.length():word1.length();
        StringBuilder sb= new StringBuilder();
        int i=0;
        for( i=0;i<l;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        String s=b?word1:word2;
        for(;i<s.length();i++){
            sb.append(s.charAt(i));
        }


      return sb.toString();  
    }
}