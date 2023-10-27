public class ReverseInteger {
    
}
class Solution {
    public int reverse(int x) {
boolean neg=false;
        if(x<0){
            neg=true;
            x=Math.abs(x);

        }

        StringBuilder sb=new StringBuilder();
        sb.append(x);
        for(int i=0;i<sb.length()/2;i++){
            char tmp=sb.charAt(i);
            char tmp2=sb.charAt(sb.length()-1-i);
            sb.setCharAt(i,tmp2);
            sb.setCharAt(sb.length()-1-i,tmp);
        }
        try{
            if(neg)
            {
                int k=-1*Integer.parseInt(sb.toString());
                return k;
            }
            int k=Integer.parseInt(sb.toString());
            return k;
            
        }catch(Exception e){
            return 0;
        }






        
    }
}