class Solution {
    public int uniquePaths(int m, int n) {
        int[][] t=new int[m][n];
        Arrays.fill(t[0],1);
        for(int i=0;i<m;i++)t[i][0]=1;
        // System.out.print(t[1][0]+" "+t[0][1]);
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                t[i][j]=t[i-1][j]+t[i][j-1];
            }
        }
        return t[m-1][n-1];    
    }
    // static int c;
    // public int uniquePaths(int m, int n) {
    //     c=0;
    //     count(m,n);
    //     return c;
        
    // }
    // public static void count(int m, int n){
    //     if(m==1&&n==1){c++;return;}
    //     if(m>0)count(m-1,n);
    //     if(n>0)count(m,n-1);
    // }
}