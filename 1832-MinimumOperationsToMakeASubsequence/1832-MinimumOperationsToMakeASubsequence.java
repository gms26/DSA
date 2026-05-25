// Last updated: 5/25/2026, 11:05:38 AM
class Solution {
    public int minOperations(int[] target, int[] arr) {
         Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<target.length;i++)
            map.put(target[i],i);

        List<Integer> list = new ArrayList<>();

        for(int num : arr){
            if(map.containsKey(num))
                list.add(map.get(num));
        }

        return target.length - sub(list);
    }
     int sub(List<Integer> nums){

        List<Integer> dp = new ArrayList<>();

        for(int num : nums){

            int i = Collections.binarySearch(dp,num);

            if(i < 0)
                i = -(i+1);

            if(i == dp.size())
                dp.add(num);
            else
                dp.set(i,num);
        }

        return dp.size();
    }
}