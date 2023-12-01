public class Permutation {
    
}
class Solution {
   
    List<List<Integer>> al=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        
        permutation(nums,0);
       
        return al;   
    }
    public void permutation(int[] str,int i) {
        if(i>=str.length){
            List<Integer> l=new ArrayList<>();
            for(int idx=0;idx<str.length;idx++){
                l.add(str[idx]);
            }
            al.add(l);
            return;
        }
        for(int j=i;j<str.length;j++){
            swap(str,i,j);
            permutation(str,i+1);
            swap(str,i,j);
        }
        
    }
    public void swap(int[] str, int i,int j) {
        int t=str[i];
        str[i]=str[j];
        str[j]=t;

    }
   
}