public class RottingOranges {
    
}
class Solution {
    ArrayList<ArrayList<Integer>> al=new ArrayList<>();

    public int orangesRotting(int[][] grid) {
        int[] c=checkOranges(grid);
        for(int i=0;i<al.size();i++){
            ArrayList<Integer> l=al.get(i);
            
            ArrayList<Integer> l2=new ArrayList<>();
            for(int j:l){
                ArrayList<Integer> l3=addAdjecent(grid,j/10,j%10);
                for(int p:l3){
                    l2.add(p);
                    c[1]++;
                }
            }
            if(l2.size()>0){
                al.add(l2);
            }
        }
        c=checkOranges(grid);
        if(c[2]>0){
            return -1;
        }
        return al.size()-2;
        

    }
//---------------------------------------------------------------------------------------
    public ArrayList<Integer> addAdjecent(int[][] grid,int i,int j) {
        ArrayList<Integer> l=new ArrayList<>();
        if(i<grid.length-1&&grid[i+1][j]==1){
            l.add((i+1)*10+j);
            grid[i+1][j]=2;

        }
        if(i>0&&grid[i-1][j]==1){
            l.add((i-1)*10+j);
            grid[i-1][j]=2;

        }
        if(j<grid[0].length-1&&grid[i][j+1]==1){
            l.add((i)*10+(j+1));
            grid[i][j+1]=2;

        }
        if(j>0&&grid[i][j-1]==1){
            l.add((i)*10+(j-1));
            grid[i][j-1]=2;

        }
        
        
        return l;


    }

//--------------------------------------------------------------------------------------
     public int[] checkOranges(int[][] grid) {
        int t=0;
        int r=0;
        int f=0;
        
        ArrayList<Integer> l=new ArrayList<>();        
        // Adding rotten index
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    r++;
                    t++;
                    l.add(i*10+j);
                }else if(grid[i][j]==1){
                    t++;
                    f++;
                }
            }
        }
        al.add(l);
        return new int[]{t,r,f};
    }
}