// Last updated: 9/28/2026, 10:25:48 PM
class Solution {
    public char kthCharacter(int k) {
        return(char)('a'+Integer.bitCount(k-1));
    }
}