// Last updated: 8/25/2026, 12:25:34 PM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        boolean f=false;
4        int i=1;
5        ArrayList<Integer>ar=new ArrayList<>();
6        for(int j=0;j<nums.length;j++){
7            ar.add(nums[j]);
8        }
9       // System.out.print(ar);
10        while(!f){
11            if(!ar.contains(i*k)){
12                f=true;return i*k;
13            }
14            i++;
15        }
16        return 0;
17    }
18}