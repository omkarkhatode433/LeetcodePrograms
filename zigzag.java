class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==0){
            return "";
        }
        char [][] c=new char[numRows][s.length()];
        int r=0,cl=0;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            c[r][cl]=s.charAt(i);
            if(r==c.length-1){
                flag=true;
            }
            if(r==0){
                flag=false;
            }
            if(r==0&&r==numRows-1){
                cl++;
                continue;

            }
            if(!flag){
                r++;
            }else{
                r--;
                cl++;

            }
              
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                if((c[i][j]>='A'&&c[i][j]<='Z')||(c[i][j]>='a'&&c[i][j]<='z')||(c[i][j]==',')||(c[i][j]=='.')){
                    sb.append(c[i][j]);
                }


            }
        }
        return sb.toString();

    }
}