public class LongestCommonPrefix {
    
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int c=0;
        try{/*
        for(int j=0;j<strs.length;j++){
             for(int i=0;i<strs.length;i++){
                if(strs[i].length()==0){
                     return sb.toString();
                }
                if(strs[0].charAt(c)!=strs[i].charAt(c)){
                    return sb.toString();
                }
             if(strs[0].charAt(c)==strs[strs.length-1].charAt(c)){
            sb.append(strs[0].charAt(c));
            c++;
             }

        }
        }*/
        while(true){
            boolean b=false;
            for(int i=0;i<strs.length;i++){
                if(strs[0].charAt(c)!=strs[i].charAt(c)){
                    b=true;
                    break;
                }
            }
            if(b){
                return sb.toString();
            }else{
                sb.append(strs[0].charAt(c));
                c++;
            }
        }
        }catch(Exception e){

        }
       
return sb.toString();
        
    }
}
