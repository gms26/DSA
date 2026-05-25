// Last updated: 5/25/2026, 11:07:35 AM
class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> b=new HashSet<>();
        
        int i=0;
        while(true){
            int c=(int)Math.pow(x,i);
            if(c>bound)break;
            int j=0;
        while(true){
            
            int d=(int)Math.pow(y,j);
            int s=c+d;
            if(s<=bound){
                b.add(s);
            }
            
            else{
                break;
            }
            if(y==1)break;
            j++;
        }
        if(x==1)break;
        i++;
        }
        List<Integer> a=new ArrayList<>(b);
        return a;
    }
}