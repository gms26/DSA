// Last updated: 6/11/2026, 12:40:11 PM
1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        int[]a=new int[s.length()];
4        Arrays.fill(a,Integer.MAX_VALUE);
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)==c)a[i]=0;
7        }
8        int i=0,j=0;
9        while(i<s.length() && j<s.length()){
10            char c1=s.charAt(j);
11            if(c1==c){
12                for(int k=i;k<j;k++){
13                    a[k]=j-k;
14                }
15                i=j+1;
16            }
17            j++;
18        }
19        i=s.length()-1;j=s.length()-2;
20     //   System.out.println(s.charAt(j));
21        while(i>=0 && j>=0){
22            char c1=s.charAt(j);
23            if(c1==c){
24                for(int k=i;k>j;k--){
25                    a[k]=Math.min(a[k],k-j);
26                }
27                i=j-1;
28            }
29            j--;
30        }
31        return a;
32    }
33}