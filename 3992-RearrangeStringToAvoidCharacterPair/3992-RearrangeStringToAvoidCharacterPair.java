// Last updated: 9/28/2026, 10:23:30 PM
class Solution {
    public String rearrangeString(String s, char x, char y) {
        boolean f=s.contains(x+"");
        if(!f)return s;
        StringBuilder sb=new StringBuilder();
        StringBuilder sx=new StringBuilder();
        StringBuilder sy=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==x)sx.append(c);
            else if(c==y)sy.append(c);
            else sb.append(c);
        }
        return sb.toString()+sy.toString()+sx.toString();
    }
}