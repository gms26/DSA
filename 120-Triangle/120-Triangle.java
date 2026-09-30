// Last updated: 9/30/2026, 9:49:44 AM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3       
4       for(int i=1;i<triangle.size();i++){
5        List<Integer> f=triangle.get(i-1);
6        List<Integer> m=triangle.get(i);
7        for(int j=0;j<m.size();j++){
8            int t=Integer.MAX_VALUE;
9            if(j<f.size())t=Math.min(t,f.get(j));
10            if(j-1>=0)t=Math.min(t,f.get(j-1));
11            m.set(j,m.get(j)+t);
12        }
13        
14       } 
15       int c=Integer.MAX_VALUE;
16       for(int i:triangle.get(triangle.size()-1)){
17        c=Math.min(c,i);
18       }
19       return c;
20    }
21}