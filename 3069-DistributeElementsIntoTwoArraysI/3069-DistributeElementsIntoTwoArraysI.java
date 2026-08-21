// Last updated: 8/21/2026, 11:24:42 AM
1class Solution {
2    public int[] resultArray(int[] nums) {
3       ArrayList<Integer>ar1=new ArrayList<>();
4        ArrayList<Integer>ar2=new ArrayList<>();
5        int []res=new int[nums.length];
6        ar1.add(nums[0]);
7        ar2.add(nums[1]);
8        for(int i=2;i<nums.length;i++){
9            if(ar1.get(ar1.size()-1)>ar2.get(ar2.size()-1)){
10                ar1.add(nums[i]);
11            }else if(ar1.get(ar1.size()-1)<ar2.get(ar2.size()-1)){
12                ar2.add(nums[i]);
13            }
14        }
15        int j=0;
16        for(int i:ar1){
17            res[j++]=i;
18        }
19        for(int i:ar2){
20            res[j++]=i;
21        }
22        return res;
23    }
24}