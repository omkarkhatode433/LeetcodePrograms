class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] t=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<obstacleGrid.length;i++){
            if(obstacleGrid[i][0]==1)break;
            else t[i][0]=1;
        }
        for(int i=0;i<obstacleGrid[0].length;i++){
            if(obstacleGrid[0][i]==1)break;
            t[0][i]=1;
        }
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[i].length;j++){
                if(obstacleGrid[i][j]==1){
                    t[i][j]=0;
                }else{
                    t[i][j]=t[i-1][j]+t[i][j-1];
                }
            }
        }
        
        return t[t.length-1][t[0].length-1];

        
    }
}