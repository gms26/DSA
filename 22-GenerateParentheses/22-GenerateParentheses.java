// Last updated: 5/25/2026, 11:13:32 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>p=new ArrayList<>();
        back(p,"",0,0,n);
        return p;
    }
    void back(List<String>p,String s,int left,int right,int n){
        if(s.length()==2*n){
            p.add(s);
            return ;
        }
        if(left<n)
        back(p,s+"(",left+1,right,n);
        if(right<left)
        back(p,s+")",left,right+1,n);
    }
}