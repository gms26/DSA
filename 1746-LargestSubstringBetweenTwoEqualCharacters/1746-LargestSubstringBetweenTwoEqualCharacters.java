// Last updated: 5/25/2026, 11:05:48 AM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer>a=new HashMap<>();
        int m=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(a.containsKey(c)){
                int d=i-a.get(c)-1;
                m=Math.max(m,d);
            }
            else{
                a.put(c,i);
            }
        }
        return m;
    }
}