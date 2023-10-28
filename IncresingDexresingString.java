public class IncresingDexresingString {
    
}
class Solution {
    public String sortString(String s) {
        ArrayList<Character> al=new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            al.add(s.charAt(i));
        }
        Collections.sort(al);
        System.out.print(al);
        
        StringBuilder sb=new StringBuilder();
        while(al.size()>0){
            sb.append(al.get(0));
            al.remove(0);
            
            int i=0;
            while(i<al.size()){
                if(al.get(i)!=sb.charAt(sb.length()-1)){
                    sb.append(al.get(i));
                    al.remove(i);
                    i--;

                }
                i++;
            }
            if(al.size()>0){
                sb.append(al.get(al.size()-1));
                al.remove(al.size()-1);
                i--;
            }
            i=al.size()-1;
            while(i>0){
                if(al.get(i)!=sb.charAt(sb.length()-1)){
                    sb.append(al.get(i));
                    al.remove(i);
                    // i++;
                }  
                i--;
            }
            
        }
        return sb.toString();
        
    }
}