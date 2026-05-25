// Last updated: 5/25/2026, 11:08:51 AM
class Solution 
{
public String[] findRestaurant(String[] list1, String[] list2) 
    {
    Map<String, Integer> indexSumMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            indexSumMap.put(list1[i], i);
        }
        
        int minIndexSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        for (int j = 0; j < list2.length; j++) {
            if (indexSumMap.containsKey(list2[j])) {
                int indexSum = j + indexSumMap.get(list2[j]);
                
                if (indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    result.clear(); 
                    result.add(list2[j]); 
                } else if (indexSum == minIndexSum) {
                    result.add(list2[j]); 
                }
            }
        }
        return result.toArray(new String[0]);
    }
}