public class ValidNumber {
    
}
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] t=new int[grid.length][grid[0].length];
        int sum=0;
        for(int i=0;i<t.length;i++){
            t[i][0]=sum+grid[i][0];
            sum+=grid[i][0];
            
        }
        sum=0;
         for(int i=0;i<t[0].length;i++){
            t[0][i]=sum+grid[0][i];
            sum+=grid[0][i];
            
        }

        
        // System.out.print(t[1][0]+" "+t[0][1]);
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                t[i][j]=Math.min(t[i-1][j],t[i][j-1])+grid[i][j];
            }
        }
        return t[t.length-1][t[0].length-1];
        
    }
}