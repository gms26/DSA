// Last updated: 5/25/2026, 11:03:42 AM
class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int reach=0,added=0,i=0;
        while(reach<target){
            if(i<coins.length && coins[i]<=reach+1){
                reach+=coins[i];
                i++;
            }
            else{
                long newcoin=reach+1;
                reach+=newcoin;
                added++;
            }
        }
        return added;
    }
}