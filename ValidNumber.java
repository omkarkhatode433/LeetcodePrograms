public class ValidNumber {
    
}
class Solution {
    public boolean isNumber(String s) {
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='0'&&s.charAt(i)<='9')||s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='.'){

            }else{
                return false;
            }
        }
        if(s.indexOf("Infinity")>-1)return false;
        try{
            double d=Double.parseDouble(s);
            System.out.print(d);
            
            return true;
           // return true;
        }catch(Exception e){
            return false;
        }
        
    }
}