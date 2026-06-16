// Last updated: 6/16/2026, 10:04:03 AM
1class Solution {
2    public int evalRPN(String[] tokens) {
3     Stack<Integer>st=new Stack<>();
4     for(String s:tokens){
5        if(s.equals("+")){
6            int a=st.pop();
7            int b=st.pop();
8            st.push(b+a);
9        }
10        else if(s.equals("-")){
11            int a=st.pop();
12            int b=st.pop();
13            st.push(b-a);
14        }
15        else if(s.equals("*")){
16            int a=st.pop();
17            int b=st.pop();
18            st.push(b*a);
19        }
20        else if(s.equals("/")){
21            int a=st.pop();
22            int b=st.pop();
23            st.push(b/a);
24        }
25        else{
26            st.push(Integer.parseInt(s));
27        }
28     }
29     return st.peek();
30    }
31}