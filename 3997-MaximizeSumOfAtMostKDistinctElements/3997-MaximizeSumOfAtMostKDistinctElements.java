// Last updated: 5/25/2026, 11:03:05 AM
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

        
        int j=0,c=0;
        ArrayList<Integer> m=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            if(!m.contains(nums[i])){
                m.add(nums[i]);
            }
        }
        Collections.sort(m);
        if(m.size()>k){
            int[]a=new int[k];
            for(int i=m.size()-1;i>m.size()-k-1;i--){
                a[j++]=m.get(i);
            }
            return a;
        }
        else{
            int []a=new int[m.size()];
            for(int i=m.size()-1;i>=0;i--){a[j++]=m.get(i);}
            return a;
        }
        
       
    }
}