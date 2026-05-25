// Last updated: 5/25/2026, 11:11:20 AM
class Solution {
    public String largestNumber(int[] nums) {
        String[]a=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]= String.valueOf(nums[i]);
        }
        
        Arrays.sort(a,(p,q)->(q+p).compareTo(p+q));
        if(a[0].equals("0"))return "0";
        StringBuilder s=new StringBuilder();
        for(String i:a)s.append(i);
        return s.toString();
    }
}