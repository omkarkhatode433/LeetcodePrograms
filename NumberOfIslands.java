public class NumberOfIslands {
    
}

class Solution {
    int f=-1; 
	int s=-1;
	int count;
	int ch;
	int island;

    public int numIslands(char[][] grid) {
        int[][] arr=new int[grid.length][];
        for(int i=0;i<arr.length;i++){
            arr[i]=new int[grid[i].length];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=grid[i][j]=='1'?1:0;
            }
        }
        while(analyze(arr)>0)
		print(arr);
        return island-1;
    }

    
    private  int analyze(int[][] arr) {
		int c=0;
		island++;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==1) {
					f=i;
					s=j;
					c++;
                    return c;
				}
			}
			
		}
		return c;
	}

	private  int print(int[][] arr) {
		
		recurse(arr,f,s);
		
		return 0;
	}

	private  void recurse(int[][] arr, int i, int j) {
		arr[i][j]=0;
		ch++;
		if(i!=0&&arr[i-1][j]==1) {
			recurse(arr, i-1, j);
			
		}
		if(i<arr.length-1&&arr[i+1][j]==1) {
			recurse(arr, i+1, j);
			
		}if(j<arr[i].length-1&&arr[i][j+1]==1) {
			recurse(arr, i, j+1);
			
		}if(j!=0&&arr[i][j-1]==1) {
			recurse(arr, i, j-1);
			
		}
		
	}

}


