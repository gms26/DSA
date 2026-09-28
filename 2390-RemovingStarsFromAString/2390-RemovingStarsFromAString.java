// Last updated: 9/28/2026, 10:29:17 PM
class Solution {
    public String removeStars(String s) {
        Stack<Character> a=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*' && !a.isEmpty()) a.pop();
            else a.push(s.charAt(i));

        }
        StringBuilder z=new StringBuilder();
        while(!a.isEmpty()) z.append(a.pop());
        z.reverse();
        return z.toString();
    }
}