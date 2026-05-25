// Last updated: 5/25/2026, 11:03:03 AM
class Solution {
    public int vowelConsonantScore(String s) {
        int v =0, c =0;

        for(char ch: s.toCharArray()){
            if(ch == 'a' || ch == 'i'|| ch == 'e'
              ||ch == 'o'|| ch == 'u'){
                v++;
            }else if (ch >='a' && ch <='z'){
                c++;
            }
        }
        return (c >0)? (v/ c):0;
    }
}