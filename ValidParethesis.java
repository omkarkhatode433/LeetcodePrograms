public class ValidParethesis {
    
}
class Solution {
    public boolean isValid(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        boolean f1=false,f2=false,f3=false;
        while(sb.length()>0){
            if(sb.indexOf("()")>=0){
                sb.delete(sb.indexOf("()"),sb.indexOf("()")+2);
                f1=false;
            }else{
                f1=true;
            }
            if(sb.indexOf("[]")>=0){
                sb.delete(sb.indexOf("[]"),sb.indexOf("[]")+2);
                f2=false;
            }else{
                f2=true;
            }
            if(sb.indexOf("{}")>=0){
                sb.delete(sb.indexOf("{}"),sb.indexOf("{}")+2);
                f3=false;
            }else{
                f3=true;
            }
            if(f1&&f2&&f3){
                return false;
            }
            System.out.print(sb);
            
        }
        
        return true;
        
    }
}