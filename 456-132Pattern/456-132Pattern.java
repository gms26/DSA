// Last updated: 5/25/2026, 11:09:26 AM
class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int m=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<m)return true;
            while(!st.isEmpty()&&nums[i]>st.peek()){
                m=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}