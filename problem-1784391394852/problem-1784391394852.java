// Last updated: 7/18/2026, 9:46:34 PM
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        boolean f=s.contains(x+"");
4        if(!f)return s;
5        StringBuilder sb=new StringBuilder();
6        StringBuilder sx=new StringBuilder();
7        StringBuilder sy=new StringBuilder();
8        for(char c:s.toCharArray()){
9            if(c==x)sx.append(c);
10            else if(c==y)sy.append(c);
11            else sb.append(c);
12        }
13        return sb.toString()+sy.toString()+sx.toString();
14    }
15}