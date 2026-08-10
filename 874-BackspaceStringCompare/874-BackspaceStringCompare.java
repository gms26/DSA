// Last updated: 8/10/2026, 12:20:15 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<String>st=new Stack<>();
        Stack<String>st1=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='#' && !st.isEmpty()){
                st.pop();
            }else if(c!='#'){
            st.push(c+"");}
        }
        for(char c:t.toCharArray()){
            if(c=='#' && !st1.isEmpty()){
                st1.pop();
            }else if(c!='#'){
            st1.push(c+"");}
        }
        s="";t="";
        while(!st.isEmpty()){
            s+=st.pop();
        }
        while(!st1.isEmpty()){
            t+=st1.pop();
        }
        System.out.print(s+" "+t);
        return s.equals(t);
    }
}