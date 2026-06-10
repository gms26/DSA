// Last updated: 6/10/2026, 12:22:38 PM
1class Solution {
2    public int countConsistentStrings(String allowed, String[] words) {
3        ArrayList<Character>a=new ArrayList<>();
4        for(char c:allowed.toCharArray()){
5            a.add(c);
6
7        }
8        int c=0;
9        
10        for(String i:words){
11            boolean f=true;
12            for(int j=0;j<i.length();j++){
13                if(!a.contains(i.charAt(j))){f=false;break;}
14                
15            }
16            if(f)c++;
17        }
18        return c;
19    }
20}