public class PascalsTriangle {
    
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        al.add(1);
        l.add(al);

        for(int i=1;i<numRows;i++){
            al=new ArrayList<>();
            al.add(1);

            for(int j=1;j<i;j++){
                al.add(l.get(i-1).get(j-1)+l.get(i-1).get(j));

            }
            al.add(1);
            l.add(al);
        }
        return l;
        
    }
}
