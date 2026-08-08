// Last updated: 8/8/2026, 2:23:23 PM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack<String>st=new Stack<>();
4        Stack<String>st1=new Stack<>();
5        for(char c:s.toCharArray()){
6            if(c=='#' && !st.isEmpty()){
7                st.pop();
8            }else if(c!='#'){
9            st.push(c+"");}
10        }
11        for(char c:t.toCharArray()){
12            if(c=='#' && !st1.isEmpty()){
13                st1.pop();
14            }else if(c!='#'){
15            st1.push(c+"");}
16        }
17        s="";t="";
18        while(!st.isEmpty()){
19            s+=st.pop();
20        }
21        while(!st1.isEmpty()){
22            t+=st1.pop();
23        }
24        System.out.print(s+" "+t);
25        return s.equals(t);
26    }
27}