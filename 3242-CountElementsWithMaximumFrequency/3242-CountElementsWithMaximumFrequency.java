// Last updated: 5/25/2026, 11:03:40 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> s=new HashMap<>();
        int m=0,r=0;
        for(int i:nums){
            int c=s.getOrDefault(i,0)+1;
            s.put(i,c);
            if(c>m){
                m=c;
                r=c;
            }
            else if(c==m){
                r+=c;
            }
            }
        return r;
    }
}