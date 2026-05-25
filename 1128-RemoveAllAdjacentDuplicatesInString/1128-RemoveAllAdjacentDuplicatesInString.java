// Last updated: 5/25/2026, 11:07:15 AM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>a=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(a.isEmpty()){
                a.push(s.charAt(i));
            }else{
                if(a.peek()==s.charAt(i)){
                    a.pop();
                }
                else{
                    a.push(s.charAt(i));
                }
            }
        }
        StringBuilder z=new StringBuilder(); 
        while(!a.isEmpty()){
            z.append(a.pop());
            }
        
        z.reverse();
        return z.toString();
    }
}