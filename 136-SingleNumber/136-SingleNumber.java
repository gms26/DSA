// Last updated: 5/25/2026, 11:11:47 AM
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> list = new LinkedHashSet<>();
        for(int i:nums){
            if(!list.add(i)) list.remove(i);
        }
        return list.iterator().next();
    }
}