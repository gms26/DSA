// Last updated: 7/13/2026, 9:58:53 AM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3        List<Integer>l=new ArrayList<>();
4        int ls=String.valueOf(low).length();
5        int hs=String.valueOf(high).length();
6        String s="123456789";
7        for(int i=ls;i<=hs;i++){
8            for(int j=0;i+j<=9;j++){
9                int a=Integer.parseInt(s.substring(j,i+j));
10                if(a>=low && a<=high){
11                    l.add(a);
12                }
13            }
14        }
15        return l;
16    }
17}