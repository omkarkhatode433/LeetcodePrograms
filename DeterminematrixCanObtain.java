public class DeterminematrixCanObtain {
    
}
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int count=0;
        while(count<=3){
            if(issame(mat,target))
               return true;
            
       int[][] m=new int[mat.length][mat.length];
        for(int i=0;i<mat.length;i++){
         
            for(int j=mat.length-1,k=0;j>=0&&k<mat.length;j--,k++){
               m[i][k]=mat[j][i];
           
            }
          
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                mat[i][j]=m[i][j];
            }
        }
        count++;
        }
        return false;
    }

    public static boolean issame(int[][] mat, int[][] target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
               if(mat[i][j]!=target[i][j])
               return false;
            }
        }
        return true;
    }
}