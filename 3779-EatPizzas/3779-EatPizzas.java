// Last updated: 7/24/2026, 6:06:49 PM
class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        int n=pizzas.length;
        int d=n/4;
        int o=(d+1)/2;
        int e=d/2;
        long a=0;
        int r=n-1;
        for(int i=0;i<o;i++){
            a+=pizzas[r--];
        }
        for(int i=0;i<e;i++){
            r--;
            a+=pizzas[r--];
        }
        return a;
            }
}