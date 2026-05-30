// Last updated: 5/30/2026, 10:36:25 AM
1class Solution {
2    public String shiftingLetters(String s, int[][] shifts) {
3       char []arr=s.toCharArray();
4       int []diff=new int[s.length()+1];
5       int t=0;
6       for(int[]q:shifts){
7        
8         int l = q[0];
9            int r = q[1];
10            int dir = q[2];
11
12           
13            if (dir == 1) {
14
15                diff[l] += 1;
16
17                if (r + 1 < s.length()) {
18                    diff[r + 1] -= 1;
19                }
20            }
21
22           
23            else {
24
25                diff[l] -= 1;
26
27                if (r + 1 < s.length()) {
28                    diff[r + 1] += 1;
29                }
30            }}
31            int c=0;
32        for(int i=0;i<s.length();i++){
33            c += diff[i];
34
35            int val = (arr[i] - 'a' + c) % 26;
36
37          
38            if (val < 0) {
39                val += 26;
40            }
41
42            arr[i] = (char)(val + 'a');
43       } 
44       return new String(arr);
45    }
46}