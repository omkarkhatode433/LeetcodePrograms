public class LetterCombinationPhoneNumber {
    
}
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> l=new ArrayList<>(); 
        if(digits.length()==0)return l;
        String[] arr={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==1){
            int n=Integer.parseInt(digits);
            for(int i=0;i<arr[n-2].length();i++){
                l.add(arr[n-2].charAt(i)+"");

            }
            return l;
        }
        if(digits.length()==2){
            int n=Integer.parseInt(digits.charAt(0)+"");
            int n1=Integer.parseInt(digits.charAt(1)+"");
            for(int i=0;i<arr[n-2].length();i++){
                String s="";
                for(int j=0;j<arr[n1-2].length();j++){
                    s=arr[n-2].charAt(i)+""+arr[n1-2].charAt(j);
                    l.add(s);
                }
            }
            return l;
        }
        if(digits.length()==3){
            int n=Integer.parseInt(digits.charAt(0)+"");
            int n1=Integer.parseInt(digits.charAt(1)+"");
            int n2=Integer.parseInt(digits.charAt(2)+"");
            for(int i=0;i<arr[n-2].length();i++){
                String s="";
                for(int j=0;j<arr[n1-2].length();j++){
                    for(int k=0;k<arr[n2-2].length();k++){
                        s=arr[n-2].charAt(i)+""+arr[n1-2].charAt(j)+arr[n2-2].charAt(k);
                        l.add(s);                    
                    }
                }
            }
            return l;
        }
        if(digits.length()==4){
            int n=Integer.parseInt(digits.charAt(0)+"");
            int n1=Integer.parseInt(digits.charAt(1)+"");
            int n2=Integer.parseInt(digits.charAt(2)+"");
            int n3=Integer.parseInt(digits.charAt(3)+"");
            for(int i=0;i<arr[n-2].length();i++){
                String s="";
                for(int j=0;j<arr[n1-2].length();j++){
                    for(int k=0;k<arr[n2-2].length();k++){
                        for(int l1=0;l1<arr[n3-2].length();l1++){
                        s=arr[n-2].charAt(i)+""+arr[n1-2].charAt(j)+arr[n2-2].charAt(k)+arr[n3-2].charAt(l1);
                        l.add(s); 
                        }
                    }
                }
            }
            return l;
        }
        return l;
        
        
    }

}