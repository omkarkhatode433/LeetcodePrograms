public class StudentAttendance {
    
}
class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        int l=0;
        int cl=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                cl++;
                if(cl>2){
                    l=cl;
                }
            }else if(s.charAt(i)=='A'){
                a++;
                cl=0;
                
            } else{
                cl=0;
            }
        }
        
        if(a>=2||l>=3){
            return false;
        }
        return true;
        
    }
}
