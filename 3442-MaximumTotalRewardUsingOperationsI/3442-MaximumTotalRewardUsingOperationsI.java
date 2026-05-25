// Last updated: 5/25/2026, 11:03:26 AM
class Solution {
    public int maxTotalReward(int[] rewardValues) {
        Arrays.sort(rewardValues);
        Set<Integer>s=new HashSet<>();
        s.add(0);
        for(int i:rewardValues){
            Set<Integer>a=new HashSet<>(s);
            for(int j:s){
                if(i>j)a.add(i+j);
            }
            s=a;
        }
        int x=0;
        for(int i:s)if(x<i)x=i;
        return x;
    }
}