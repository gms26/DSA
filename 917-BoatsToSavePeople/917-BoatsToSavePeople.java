// Last updated: 5/25/2026, 11:07:55 AM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c=0,l=0,r=people.length-1;
        Arrays.sort(people);
        while(l<=r){
            if(people[l]+people[r]<=limit){
                c++;
                l++;
                r--;
            }
            else{
                r--;
                c++;
            }
            
        }
        return c;
    }
}