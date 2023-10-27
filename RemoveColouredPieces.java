class Solution {
    public boolean winnerOfGame(String colors) {
        StringBuilder sb=new StringBuilder();
        sb.append(colors);
        int a1=0,b1=0,ac=0,bc=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='A'){
                ac++;
                bc=0;
            }else{
                bc++;
                ac=0;
            }
            if(ac>2){
                a1++;
            }else if(bc>2){
                b1++;
            }

        }
        if(a1>b1){
            return true;
        }
        return false;
        
    }
}