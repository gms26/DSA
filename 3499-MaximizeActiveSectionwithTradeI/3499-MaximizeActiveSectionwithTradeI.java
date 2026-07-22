// Last updated: 7/22/2026, 2:39:36 PM
1class Solution {
2    
3    public int maxActiveSectionsAfterTrade(String s) {
4        int n=s.length();
5        List<Integer>l=new ArrayList<>();
6        List<Character>ch=new ArrayList<>(); 
7        char []ca=s.toCharArray();
8        int c=0;
9        for(char c1:ca)if(c1=='1')c++;
10        int i=0;
11        while(i<s.length()){
12            int j=i,cnt=0;
13            char z=s.charAt(j);
14            while(j<s.length() && s.charAt(j)==z){
15                cnt++;
16                j++;
17            }
18            i=j;
19            l.add(cnt);
20            ch.add(z);
21        }
22        int r=c;
23        for(int j=1;j<l.size()-1;j++){
24            if(ch.get(j)=='1' && ch.get(j-1)=='0' && ch.get(j+1)=='0'){
25                r=Math.max(r,l.get(j-1)+l.get(j+1)+c);
26            }
27        }
28        return r;
29    }
30} 