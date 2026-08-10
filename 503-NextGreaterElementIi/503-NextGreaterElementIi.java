// Last updated: 8/10/2026, 12:22:10 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[]a=new int[n];
        Arrays.fill(a,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int j=i%n;
            while(!st.isEmpty() && st.peek()<=nums[j]){
                st.pop();
            }
            if(!st.isEmpty())a[j]=st.peek();
            st.push(nums[j]);
        }
        return a;
    }
}