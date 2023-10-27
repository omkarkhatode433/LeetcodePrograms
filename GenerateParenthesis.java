class Solution {
    static List<String> l;
   // static StringBuilder sb;
    
    public List<String> generateParenthesis(int n) {
        l=new ArrayList<>();
      //  sb=new StringBuilder();
        check(n,n,"","");
        return l;        
    }
    public static void check(int op,int cp,String c,String sb){
        sb=sb+c;
        if(op==0&&cp==0){
            l.add(sb);           
            return;
        }
        if(op>0)
        check(op-1,cp,"(",sb);
        if(cp>0&&cp>op)
        check(op,cp-1,")",sb);


        
    }
}