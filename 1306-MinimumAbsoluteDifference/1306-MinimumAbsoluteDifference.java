// Last updated: 5/25/2026, 11:06:45 AM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> a=new ArrayList<>();
        
        Arrays.sort(arr);
        int z=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            z=Math.min(z,arr[i+1]-arr[i]);
        }
        for(int i=0;i<arr.length-1;i++){
           if(arr[i+1]-arr[i]==z){
            a.add(Arrays.asList(arr[i],arr[i+1]));
           }
        }
        return a;
    }
}