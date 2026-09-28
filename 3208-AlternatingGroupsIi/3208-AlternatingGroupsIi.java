// Last updated: 9/28/2026, 10:26:05 PM
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