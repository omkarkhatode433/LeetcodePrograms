public class IsSubSequence {
    
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        StringBuilder sb=new StringBuilder();
        sb.append(t);
        int id=-1;
        for(int i=0;i<s.length();i++){
            id=sb.indexOf(s.charAt(i)+"",id+1);
            
            System.out.println(id);
            if(id==-1){
                return false;
            }

        }
        return true;
        
    }
}
