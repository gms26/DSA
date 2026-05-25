// Last updated: 5/25/2026, 11:03:23 AM
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int ans=0,c=1,n=colors.length;
        for(int i=1;i<n+k-1;i++){
            if(colors[i%n]!=colors[(i-1)%n]){
                c++;
            }
            else{
                c=1;
            }
            if(c>=k)ans++;
        }
        return ans;
        
    }
}