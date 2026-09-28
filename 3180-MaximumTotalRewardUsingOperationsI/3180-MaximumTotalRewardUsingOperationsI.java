// Last updated: 9/28/2026, 10:26:11 PM
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