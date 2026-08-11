// Last updated: 8/11/2026, 9:42:32 AM
1class Solution {
2    public int missingInteger(int[] nums) {
3        ArrayList<Integer>ar=new ArrayList<>();
4        for(int i:nums){
5            ar.add(i);
6        }
7        int c=nums[0];
8        for(int i=1;i<nums.length;i++){
9            if(nums[i-1]+1==nums[i]){
10                c+=nums[i];
11            }
12            else{
13                if(ar.contains(c)){
14                while(ar.contains(c)){
15                    c++;
16                }
17                return c;}
18                else if(!ar.contains(c)){
19                    return c;
20                }
21                c=nums[i];
22
23            }
24        }
25        if(!ar.contains(c))return c;
26        return c+1;
27    }
28}