// Last updated: 8/17/2026, 8:26:21 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Arrays.sort(nums);
4        if(nums.length<1)return 0;
5        int c=1,m=1;
6        for(int i=1;i<nums.length;i++){
7            if(nums[i-1]==nums[i]){
8                continue;
9            }
10            else if(nums[i-1]+1==nums[i]){
11                c++;
12            }
13            else{
14                c=1;
15            }
16            m=Math.max(m,c);
17        }
18        return m;
19        // ArrayList<Integer>s=new ArrayList<>();
20        // for(int i:nums){
21        //     if(!s.contains(i) )
22        //     s.add(i);
23        // }
24        // System.out.print(s);
25        // int j=1,c=1,z=s.get(0),m=0;
26        // while(j<s.size()){
27        //     if(s.get(j)==z+1){
28        //         c++;
29        //         z=s.get(j);if(m<c)m=c;
30        //     }
31        //     else if(s.get(j)!=z+1){
32        //         z=s.get(j);
33        //         c=1;
34        //     }
35        //     j++;
36        // }
37        // if(m<c)return c;
38        // return m;
39    }
40}