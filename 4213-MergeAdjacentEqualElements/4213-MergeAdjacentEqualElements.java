// Last updated: 5/25/2026, 11:02:53 AM
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
       Deque<Long> st=new ArrayDeque<>();
        for(long x:nums){
            long cur=x;
            while(!st.isEmpty() && st.peek()==cur){
                cur+=st.pop();
            }
            st.push((Long)cur);}
            List<Long>res=new ArrayList<>();
            for(int i=st.size()-1;i>=0;i--){
                res.add(0,st.pop());
            }
            
        return res;
    }
}