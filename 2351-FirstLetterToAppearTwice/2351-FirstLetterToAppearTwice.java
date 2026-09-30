// Last updated: 9/30/2026, 9:53:03 AM
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