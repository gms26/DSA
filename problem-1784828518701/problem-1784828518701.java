// Last updated: 7/23/2026, 11:11:58 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        HashMap<Character,Integer>h=new HashMap<>();
4        int c=0;
5        for(char ch:s1.toCharArray()){
6            if(!h.containsKey(ch))c++;
7            h.put(ch,h.getOrDefault(ch,0)+1);
8            
9        }
10        
11       int z1=s1.length();
12        for(int i=0;i+z1<=s2.length();i++){
13          
14            HashMap<Character,Integer>h1=new HashMap<>();
15            //ArrayList<Character>ar=new ArrayList<>();
16            
17            
18            for(int j=i;j<z1+i;j++){
19                char ch=s2.charAt(j);
20                h1.put(ch,h1.getOrDefault(ch,0)+1);
21            }
22            if(h.equals(h1))return true;
23            
24        }    
25      return false;
26
27    }
28}