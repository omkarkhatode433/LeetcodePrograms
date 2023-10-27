class Solution {
    public int minimumOperations(String num) {
        if(num.length()==1)return 1;
        int z=num.lastIndexOf("0"),f=num.lastIndexOf("5");
        int zz=Integer.MAX_VALUE;
        int ff=zz;
        boolean f1=true,f2=true;
        if(z!=-1){
            int idx=Math.max(num.lastIndexOf("5",z-1),num.lastIndexOf("0",z-1));
            			zz = num.length() - idx - 2;
                        if(idx==-1)f1=true;else f1=false;


        } if(f!=-1){
            int idx=Math.max(num.lastIndexOf("2",f-1),num.lastIndexOf("7",f-1));
            ff = num.length() - idx - 2;
            if(idx==-1)f2=true;else f2=false;



        } 
        int ze=0;     
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='0')ze++;
        }  
        

        if((f==-1&&z==-1)||(f1&&f2)) return num.length()-ze;
        System.out.println(ff+" "+zz);
        return Math.min(ff,zz);
        
    }
}