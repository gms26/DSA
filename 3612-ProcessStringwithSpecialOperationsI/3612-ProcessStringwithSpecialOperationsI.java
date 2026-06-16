// Last updated: 6/16/2026, 10:20:02 AM
1class Solution {
2    public String processStr(String s1) {
3        StringBuilder s=new StringBuilder();
4        char z='q';
5        for(char c:s1.toCharArray()){
6            if(c>=97 && c<123){
7                s.append(c);
8                
9            }
10            else if(s.length()>0 && c=='*'){
11                s.deleteCharAt(s.length()-1);
12            }
13            else if(c=='#'){
14                s.append(s);
15            }
16            else if(c=='%'){
17                s.reverse();
18            }
19        }
20       return s.toString();
21    }
22}