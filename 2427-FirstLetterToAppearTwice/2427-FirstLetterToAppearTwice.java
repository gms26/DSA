// Last updated: 5/25/2026, 11:04:31 AM
class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character>v=new HashSet<>();
        for(char c:s.toCharArray()){
            if(v.contains(c)){
                return c;
            }
            v.add(c);
        }
        return 0;
    }
}