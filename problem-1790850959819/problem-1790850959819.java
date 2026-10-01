// Last updated: 10/1/2026, 4:05:59 PM
1class Solution {
2    public String simplifyPath(String path) {
3        String[]s=path.split("/");
4        for(String c:s){
5            // System.out.print(c+",");
6        }
7        Stack<String>st=new Stack<>();
8        for(String c:s){
9            if(c.equals("..")){
10                if(!st.isEmpty())
11                st.pop();
12            }
13            else if(c.equals("."))continue;
14            else if(!c.equals(""))st.push(c);
15        }
16        Stack<String>stc=new Stack<>();
17        while(!st.isEmpty()){
18            if(st.peek()!=" ")
19            stc.push(st.pop());
20        }
21        System.out.print(stc);
22        StringBuilder sb=new StringBuilder();
23        while(!stc.isEmpty()){
24            if(stc.peek()==""){
25                stc.pop();
26            }
27            else{
28                sb.append("/").append(stc.pop());
29            }
30            
31          // sb.append("/");
32        }
33        return sb.toString()==""?"/":sb.toString();
34        
35    }
36}