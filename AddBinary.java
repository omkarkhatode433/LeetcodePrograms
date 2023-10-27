public class AddBinary {
    
}
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder(); 
        int j=a.length()>b.length()?a.length():b.length();
        
            char c='0';
            char n='0';
        for(int i=0;i<j;i++){
            char f='0';
            char s='0';
            
            if(i<a.length()){
                f=a.charAt(a.length()-1-i);
                System.out.println(f);
            }
            if(i<b.length()){
                s=b.charAt(b.length()-1-i);
                
            }
            System.out.println(s);
            if(f=='1'){
                if(s=='1'){
                    if(c=='1'){
                        n='1';
                        c='1';
                    }else{
                        n='0';
                        c='1';
                    }
                    
                }
                if(s=='0'){
                    if(c=='1'){
                        n='0';
                        c='1';
                    }else{
                        n='1';
                        c='0';
                    }
                }
            }else{
                if(s=='1'){
                    if(c=='1'){
                        n='0';
                        c='1';
                    }else{
                        n='1';
                        c='0';
                    }
                    
                }
                if(s=='0'){
                    if(c=='1'){
                        n='1';
                        c='0';
                    }else{
                        n='0';
                        c='0';
                    }
                }
            }
            sb.insert(0,n);
        }
        if(c=='1'){
            sb.insert(0,c);
        }
        return sb.toString();
        
    }
}