class Solution {
    public int myAtoi(String s) {
        int firstidx=-1;
        int sym=0;
        boolean neg=false;
        StringBuilder sb=new StringBuilder();
        try{
            int i=Integer.parseInt(s);
            return i;
        }catch(Exception e){

        }
        if(s.length()>0){
        if(s.charAt(0)=='0'){
            return 0;
        }
        }
       

        for(int i=0;i<s.length();i++){
            if(sb.length()>0&&s.charAt(i)==' '){
                break;
            }
            if((s.charAt(i)>='0'&&s.charAt(i)<='9')||s.charAt(i)==' '||s.charAt(i)=='-'||s.charAt(i)=='+'){
                if(s.charAt(i)=='-'||s.charAt(i)=='+'){
                    sym++;
                    if(sym>1)
                    break;
                     if(i<s.length()-1){
                    if(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'){

                    }else
                    return 0;}
                }
                if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                firstidx=i;
                if(i>0){
                if(s.charAt(i-1)=='-')
                neg=true;
                }
                
                sb.append(s.charAt(i));
                if(i!=s.length()-1)
                if(s.charAt(i+1)=='+')
                break;
                try{
                    System.out.println(sb.toString());
                    int k=Integer.parseInt(sb.toString());
                }
                catch(Exception e){
                     if(neg)
                     return Integer.MIN_VALUE;
                     return Integer.MAX_VALUE;
                     
                }
                if(i<s.length()-1){
                if(s.charAt(i+1)<'0'&&s.charAt(i+1)>'9'){
                    break;
                }
            }
                }
            }else
            break;
        }
        if(sb.isEmpty())
        return 0;
        if(neg){
            int k=-1*(Integer.parseInt(sb.toString()))+0;
            return k;
        }
        int k=Integer.parseInt(sb.toString())+0;
        return k;
        
    }
}