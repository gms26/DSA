// Last updated: 6/10/2026, 11:19:21 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n=nums.length;
4        int[]a=new int[n];
5        Arrays.fill(a,-1);
6        Stack<Integer> st=new Stack<>();
7        for(int i=2*n-1;i>=0;i--){
8            int j=i%n;
9            while(!st.isEmpty() && st.peek()<=nums[j]){
10                st.pop();
11            }
12            if(!st.isEmpty())a[j]=st.peek();
13            st.push(nums[j]);
14        }
15        return a;
16    }
17}