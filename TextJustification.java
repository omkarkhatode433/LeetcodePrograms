public class TextJustification {
    
}
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> l=new ArrayList<>();
        int i=0;
        while(i<words.length){
            StringBuilder sb=new StringBuilder();
            while(i<words.length&&(sb.length()==0?true:false||sb.length()+words[i].length()<maxWidth)){
                if(sb.length()!=0){
                    sb.append(" ");
                }
                sb.append(words[i]);
                i++;
                
            }
            
            l.add(sb.toString());
        }
        for( i=0;i<l.size()-1;i++){
            l.set(i,customize(l.get(i),maxWidth));
        }
        StringBuilder sb=new StringBuilder();
        sb.append(l.get(i));
        while(sb.length()<maxWidth)
        sb.insert(sb.length()," ");
        l.set(i,sb.toString());

        
       return l; 
    }
    public static String customize(String s,int m){
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        int i=0,c=0;
        if(sb.indexOf(" ",i)==-1&&sb.length()<m)sb.insert(sb.length(), " ");
        while(sb.length()<m){
        	if(i>=sb.length()){ i=0;c++;}
            if(sb.charAt(i)==' ') {
            	sb.insert(i, " ");
            	i++;
                i+=c;
            }
            if(sb.length()==m) {
            	break;
            }
            i++;            
        }
        return sb.toString();

    }
}
