// Last updated: 8/31/2026, 12:18:11 PM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean f=false;
        int i=1;
        ArrayList<Integer>ar=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            ar.add(nums[j]);
        }
       // System.out.print(ar);
        while(!f){
            if(!ar.contains(i*k)){
                f=true;return i*k;
            }
            i++;
        }
        return 0;
    }
}