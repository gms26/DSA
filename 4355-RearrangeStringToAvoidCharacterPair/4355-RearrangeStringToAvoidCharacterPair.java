// Last updated: 7/24/2026, 6:06:23 PM
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