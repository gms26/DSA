// Last updated: 6/3/2026, 6:27:39 PM
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] fre=new int[128];
4        for(char c:s.toCharArray()){
5            fre[c]++;
6        }
7        int res=0;
8        boolean check=false;
9        for(int x:fre){
10            if(x%2==0) res+=x;
11            else {
12                res+=x-1;
13                check=true;
14                }
15        }
16        if(check){
17            res++;
18        }
19        return res;
20    }
21}