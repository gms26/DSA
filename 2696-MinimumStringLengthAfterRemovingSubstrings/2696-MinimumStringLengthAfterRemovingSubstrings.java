// Last updated: 9/28/2026, 10:27:35 PM
class Solution {
    public int minLength(String s) {
        Stack<Character> a=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(a.isEmpty()){
                a.push(s.charAt(i));
            }
            else{
                char c=s.charAt(i);
                if(a.peek()=='A' && c=='B' || (a.peek()=='C' && c=='D'))a.pop();
                else a.push(c);
            }
        }
        return a.size();
    }
}