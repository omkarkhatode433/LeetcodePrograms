import java.util.*;

public class triangle {
    
}
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] arr=new int[triangle.size()][];
        int i=0;
        for(List<Integer> l:triangle){
            arr[i]=new int[l.size()];
            int p=0;
            for(int j:l){
                arr[i][p++]=j;
            }
            i++;

        }
        return print(arr); 
    }
    private static int print(int[][] arr) {
		int[][] dp=new int[arr.length][];
		for(int i=0;i<dp.length;i++) {
			dp[i]=new int[i+1];
		}
		dp[0][0]=arr[0][0];
		for(int i=1;i<dp.length;i++) {
			
			dp[i][0]=arr[i][0]+dp[i-1][0];
			
			for(int j=1;j<dp[i].length-1;j++) {
				dp[i][j]=arr[i][j]+Math.min(dp[i-1][j], dp[i-1][j-1]);		
			}
			
			
			
			dp[i][dp[i].length-1]=arr[i][dp[i].length-1]+dp[i-1][dp[i-1].length-1];
		}
		
		int min=Integer.MAX_VALUE;
		for(int i=0;i<dp.length;i++) {
			if(min>dp[dp.length-1][i]) {
				min=dp[dp.length-1][i];
			}
		}
		return min;
	}
    
    // int[][] dp;
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     boolean b=false;
    //     int s=0;
    //     for(List<Integer> l:triangle){
            
    //         s+=l.get(0);
    //         if(l.get(0)<0){
    //             b=true;
    //         }
    //     }
    //     if(s==0&&!b){
    //         return s;
    //     }


    //     //-----------------------------------------------------
    //     dp=new int[triangle.size()][];
    //     for(int i=0;i<dp.length;i++){
    //         dp[i]=new int[i+1];
    //         Arrays.fill(dp[i],Integer.MAX_VALUE);
    //     }
        
        
    //     int n1= mn(triangle,0,0,0);
    //     for(int[] i:dp){
    //         System.out.println(Arrays.toString(i));
            
    //     }
    //     System.out.println("_----------------");
    //     return n1;
        
    // }
    // public int mn(List<List<Integer>> triangle,int s,int i,int r){
        
    //     if(r==triangle.size()){
    //         // System.out.println(s+" "+i+" "+r);
    //         return s;
    //     }
    //     // System.out.println(s+" "+i+" "+r);
    //     // if(dp[r][i]!=Integer.MAX_VALUE){
    //     //     if(r==triangle.size()-1)
    //     //     return Math.min(dp[r][i],s);
    //     //     return dp[r][i];
    //     // }
    //     // System.out.println(triangle.get(r).get(i));
    //     int f=mn(triangle,s+triangle.get(r).get(i),i,r+1);
    //     int s1=mn(triangle,s+triangle.get(r).get(i),i+1,r+1);
    //     // System.out.println(f+" "+s1+" "+s+" "+i+" "+r);
    //     return dp[r][i]=Math.min(f,s1);

    // }
}
