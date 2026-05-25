// Last updated: 5/25/2026, 11:07:29 AM
class Solution {
    public List<Integer> addToArrayForm(int[] n, int k) {
        List<Integer> a=new ArrayList<>();
        int i=n.length-1;
        while(i>=0 || k>0){
            if(i>=0){
                k+=n[i];
                i--;
            }
            a.add(k%10);
            k/=10;
        }
        Collections.reverse(a);
        return a;
    }
}