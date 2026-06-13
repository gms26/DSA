// Last updated: 6/13/2026, 11:35:49 AM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder a=new StringBuilder();
4        for(String s:words){
5            int s1=0;
6            for(int j=0;j<s.length();j++){
7                int a1=s.charAt(j)-'a';
8                s1+=weights[a1];
9            }
10            a.append((char)('z'-(s1%26)));
11        }
12        return a.toString();
13    }
14}