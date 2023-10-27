class Solution {
    public int findTheWinner(int n, int k) {
        k--;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=n;i++)al.add(i);
        int k1=0;
        while(al.size()>1){
           al.remove(k1= (k1+(k%al.size()))%al.size());
        }
        return al.get(0);
        
    }
}