// Last updated: 5/25/2026, 11:11:59 AM
class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> s=new ArrayList<>();
      
            long n=1;
            for(int j=0;j<=r;j++){
                s.add((int)n);
                n=n*(r-j)/(j+1);
                
            }
            
        
        return s;
    }

}