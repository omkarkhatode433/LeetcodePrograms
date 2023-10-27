public class RotateImage {
    
}
class Solution {
    public void rotate(int[][] matrix) {
       
       int[][] m=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
         
            for(int j=matrix.length-1,k=0;j>=0&&k<matrix.length;j--,k++){
               m[i][k]=matrix[j][i];
           
            }
          
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=m[i][j];
            }
        }
    
        
    }
}