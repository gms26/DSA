// Last updated: 5/25/2026, 11:10:38 AM
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer>r=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            if(c=='+'||c=='-'||c=='*'){
                List<Integer> left=diffWaysToCompute(expression.substring(0,i));
                List<Integer> right=diffWaysToCompute(expression.substring(i+1));
                for(int l: left){
                    for(int r1: right){
                        if(c=='+')r.add(l+r1);
                        else if(c=='-')r.add(l-r1);
                        else r.add(l*r1);
                    }
                }
            }
            
        }
        if(r.size()==0){
                r.add(Integer.valueOf(expression));
            }
        return r;
    }
}