// Last updated: 6/10/2026, 12:02:17 PM
1class Solution {
2    public String convert(String s, int numRows) {
3        int n=s.length();
4        if(numRows>s.length() || numRows==1 )return s;
5        char[][]ch=new char[numRows][n];
6        for(char[]i:ch)
7        Arrays.fill(i,'1');
8        int r=0;
9        boolean f=true;
10        for(int i=0;i<n;i++){
11            ch[r][i]=s.charAt(i);
12
13            if(r==0)
14            f=true;
15            else if(r==numRows-1)f=false;
16
17            r+=f?1:-1;
18        }
19        String z="";
20        for(int i=0;i<numRows;i++){
21            for(int j=0;j<n;j++){
22                if(ch[i][j]!='1'){
23                    z+=ch[i][j]+"";
24                }
25            }
26        }
27        return z;
28    }
29}