// Last updated: 6/11/2026, 10:39:34 PM
1class Solution {
2    public int calculate(String z) {
3        Stack<Integer>st=new Stack<>();
4        int r=0,n=0,s=1;
5        for(char c:z.toCharArray()){
6            if(Character.isDigit(c)){
7                n=n*10+(c-'0');
8            }
9            else if(c=='+'){
10                r+=s*n;
11                n=0;s=1;
12            }
13            else if(c=='-'){
14                r+=s*n;
15                n=0;
16                s=-1;
17            }
18            else if(c=='('){
19                st.push(r);
20                st.push(s);
21                r=0;s=1;
22            }
23            else if(c==')'){
24                r+=s*n;n=0;
25                r*=st.pop();
26                r+=st.pop();
27            }
28        }
29        r+=s*n;
30        return r;
31    }
32}