// Last updated: 5/25/2026, 11:13:53 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st=new HashSet<>();
        int l=0,len=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(st.contains(c)){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(c);
            len=Math.max(len,(i-l)+1);
        }
        return len;
    }
}