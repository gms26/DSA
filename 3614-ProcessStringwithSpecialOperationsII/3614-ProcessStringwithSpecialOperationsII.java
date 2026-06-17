// Last updated: 6/17/2026, 6:28:50 PM
1class Solution {
2    public char processStr(String s, long k) {
3        StringBuilder a=new StringBuilder();
4        long l=0;
5        for(char c:s.toCharArray()){
6            if(Character.isLowerCase(c)){
7                l++;
8            }
9            else if(c=='#'){
10                l*=2;
11            }
12           
13            else if(c=='*'){
14                if(l>0)
15                l--;
16            }
17            
18        }
19        if(k>=l){
20            return '.';
21        }
22        
23        for(int i=s.length()-1;i>=0;i--){
24            char c=s.charAt(i);
25            if(Character.isLowerCase(c)){
26                if(k==l-1)return c;
27                l--;
28            }
29            else if(c=='#'){
30                l/=2;
31                k%=l;
32            }
33            else if(c=='%'){
34                k=l-1-k;
35            }
36            else if(c=='*'){
37                
38                l++;
39            }
40            
41        }
42        return '.';
43    }
44}