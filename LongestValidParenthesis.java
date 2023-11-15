public class LongestValidParenthesis {
    

}
class Solution {
    // static int max=0;
    public int longestValidParentheses(String str) {
        int max=0;
        int op=0;
        int cl=0;
        int curr=0;
        for(int i=0;i<str.length();i++){
            op=0;
                cl=0;
            for(int j=i;j<str.length();j++){
                if(str.charAt(j)=='('){
                op++;
            }if(str.charAt(j)==')'){
                cl++;
            }
            if(op==cl){
                if(max<op+cl)max=cl*2;
            }
            if(cl>op){
                break;
            }
            }
        }
        return max;




    }

    //    ArrayList<Character> al=new ArrayList<>();
	// 	int max=0,min=0;
	// 	int curr=0;
	// 	for(int i=0;i<str.length();i++) {
	// 		if(str.charAt(i)=='(') {
	// 			al.add(str.charAt(i));
	// 		}else {
	// 			if(al.size()>0&&al.get(al.size()-1)=='(') {
	// 				al.remove(al.size()-1);
	// 				curr+=2;
	// 				if(max<curr) {
	// 					max=curr;
	// 				}
	// 			}else {
						
	// 				curr=0;
	// 			}
	// 		}
			
	// 	}
	// 	for(int i=str.length()-1;i>=0;i--) {
	// 		if(str.charAt(i)==')') {
	// 			al.add(str.charAt(i));
	// 		}else {
	// 			if(al.size()>0&&al.get(al.size()-1)==')') {
	// 				al.remove(al.size()-1);
	// 				curr+=2;
	// 				if(min<curr) {
	// 					min=curr;
	// 				}
	// 			}else {
						
	// 				curr=0;
	// 			}
	// 		}
		
	// 	}
	// 	return Math.min(max,min);
        
    // }

    

}

