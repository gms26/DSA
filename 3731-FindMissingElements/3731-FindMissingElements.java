// Last updated: 8/5/2026, 10:00:23 AM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int min=nums[0],max=nums[0];
4        for(int i:nums){
5            if(min>i){
6                min=i;
7            }
8            if(max<i)max=i;
9        }
10        ArrayList<Integer>ar=new ArrayList<>();
11        for(int i=min;i<max;i++){
12            boolean f=false;
13            for(int j=0;j<nums.length;j++){
14                if(i==nums[j]){f=true;break;}
15            }
16            if(!f)ar.add(i);
17        }
18        return ar;
19    }
20}