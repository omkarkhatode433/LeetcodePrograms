public class SearchA2Dmatrix {
    
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] i:matrix){
            for(int j:i)
            if(j==target)
            return true;
        }
        return false;
        
    }
}
