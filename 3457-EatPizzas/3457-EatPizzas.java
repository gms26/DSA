// Last updated: 9/28/2026, 10:25:18 PM
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